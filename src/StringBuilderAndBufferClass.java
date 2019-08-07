/**
 * Created by aborisco on 2/8/2018.
 */
public class StringBuilderAndBufferClass {

    public static void main(String[] args) {
        StringBuilder first = new StringBuilder("abc"); //only one object of StringBuilder
        StringBuilder second = first.append("d").append("f");
        second.append("g").append("e");
        System.out.println("first = " + first);
        System.out.println("second = " + second);

        StringBuilder sb1 = new StringBuilder();            //empty object with default capacity 16
        StringBuilder sb2 = new StringBuilder("animal");    //Object with animal
        StringBuilder sb3 = new StringBuilder(10);   //capacity for 10 char

        //Size is the number of characters currently in the sequence, and capacity is the number
        // of characters the sequence can currently hold.

        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al")); //wont change
        int len = sb.length();  // wont change
        char ch = sb.charAt(6); // wont change
        System.out.println(sub + " " + len + " " + ch);

        StringBuilder sb4 = new StringBuilder().append(1).append('c');
        sb4.append("-").append(true);
        System.out.println(sb4); // 1c-true

        sb4.insert(2,"-");
        sb4.insert(5, "_");
//        sb4.insert(12, "_"); StringIndexOutOfBoundsException
        System.out.println(sb4);

        sb4 = new StringBuilder("HelloMotto");
        System.out.println(sb4.delete(1,3)); //HloMotto
        System.out.println(sb4.deleteCharAt(3)); //Hlootto


        sb4 = new StringBuilder("ABC");
        sb4.reverse();
        System.out.println(sb4);//CBA

//        String a = sb4; don't this, because this is classes
        String str1 = sb4.toString();

        StringBuilder sb5 = new StringBuilder("Hell");
        sb5.insert(sb5.indexOf("e"), "Man");
        System.out.println(sb5);

    }

}
