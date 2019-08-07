/**
 * Created by aborisco on 2/7/2018.
 */
public class StringClass {

    public static void main(String[] args) {
        //left to right evaluation
        System.out.println(1 + 2);              //3
        System.out.println("a" + "b");          //ab
        System.out.println("a" + "b" + 3);      //ab3
        System.out.println(1 + 2 + "c");        //3c

        String s1 = "1";
        s1 += "2";
        s1 += 3;
        System.out.println(s1);

        //Immutable
        String s2 = "1";
        String s3 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);

        //string pool, also known as the intern pool
        String name1 = "Fluffy";                     // in String pool
        String name2 = new String("Fluffy");  // in JVM garbage collector

        System.out.println(name2.length() + " " + name1.length()); // 6 6
        System.out.println(name1.charAt(0) + " " + name1.charAt(5)); // F y

        System.out.println(name1.indexOf('f')); //3 case sensitive
        System.out.println(name1.indexOf('F', 3)); //-1 none
        System.out.println(name1.indexOf("ff")); //3
        System.out.println(name1.indexOf("ff", 3));

        System.out.println(name1.substring(3));
        System.out.println(name1.substring(name1.indexOf('f')));
        System.out.println(name1.substring(3, 4) + " -  Fluffy");
        System.out.println(name1.substring(3, 6));

        try {
            System.out.println(name1.substring(3, 3)); // empty string
            System.out.println(name1.substring(3, 2)); // throws exception
            System.out.println(name1.substring(3, 8)); // throws exception
        }catch (Exception e){

        }

        System.out.println("HeLloW".toUpperCase()); //HELLOW
        System.out.println("HeLloW".toLowerCase()); //hellow

        System.out.println("ASD".equals("asd"));//true
        System.out.println("ASD".equalsIgnoreCase("asd"));//true

        System.out.println("abc".startsWith("s")); //false
        System.out.println("abc".endsWith("c")); //true
        System.out.println("abc".endsWith("C".toLowerCase())); //True

        System.out.println("abc".contains("b")); // true
        System.out.println("abc".contains("B")); // false

        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("a", "A")); // AbcAbc

        System.out.println("abc".trim());   //abc
        System.out.println("\t    a b c\n".trim()); //a b c--
        System.out.println(" a b c ".trim());   //a b c---

        System.out.println("AniMaL ".trim().toLowerCase().replace('a', 'A'));
        //                  start -> 1    ->    2   ->      3   -> answer


        System.out.println("Hello man".concat("fghjk"));
        System.out.println("Hello man  "   .trim());
        System.out.println("Hello man  "   .substring(1, 2));
        System.out.println("hell".replace('e', 'c'));

    }
}
