/**
 * Created by aborisco on 2/8/2018.
 */
public class EqualityMethods {

    public static void main(String[] args) {


                String myStr = "good";
                char[] myCharArr = {'g', 'o', 'o', 'd' };

                String newStr = null;
                for(char ch : myCharArr){
                    newStr = newStr + ch;
                }

        System.out.println(newStr.substring(5, 8));

                System.out.println((newStr == myStr)+ " " + (newStr.equals(myStr)));



        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = s2;
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1 == s3);

        StringBuilder st1 = new StringBuilder("Hello");
        StringBuilder st2 = new StringBuilder("Hello");
        StringBuilder st3 = st2.append("Motto");
        System.out.println(st1 == st2);
        System.out.println(st1 == st3);
        System.out.println(st2 == st3);
        System.out.println(st2.equals(st3)); //implements equals


        String x = "Hello";
        String z = " Hello".trim();
        System.out.println(x == z);//false because it isn’t the same at compile-time

        x = new String("Hello World");
        String y = "Hello World";
        System.out.println(x == y); // false

        x = "Hello World";
        z = " Hello World".trim();
        System.out.println(x.equals(z)); // true


        Tests ts1 = new Tests();
        Tests ts2 = new Tests();
        Tests ts3 = ts1;
        System.out.println(ts1 == ts2); //false
        System.out.println(ts1 == ts3); //true
        System.out.println(ts1.equals(ts2)); //false because equals isn't implemented

        Long l1 = new Long(5L);
        Long l2 = new Long(5L);
        System.out.println(l1.equals(l2)); //true because equals is implemented


        new Integer(2).equals(2);







    }
}
