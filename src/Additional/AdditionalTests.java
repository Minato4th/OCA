package Additional;

/**
 * Created by aborisco on 10/10/2018.
 */
public class AdditionalTests {

//    public static void printSum(byte a, byte b) {
//        System.out.println("In byte " + (a + b));
//    }
//
//    public static void printSum(short a, short b) {
//        System.out.println("In byte " + (a + b));
//    }
//
//    public static void printSum(char a, char b) {
//        System.out.println("In byte " + (a + b));
//    }


    public static void printSum(int a, int b) {
        System.out.println("In int " + (a + b));
    }

//    public static void printSum(Integer a, Integer b) {
//        System.out.println("In Integer " + (a + b));
//    }

//    public static void printSum(double a, double b) {
//        System.out.println("In double " + (a + b));
//    }

//    public static void printSum(float a, float b) {
//        System.out.println("In double " + (a + b));
//    }

    public static void printSum(Double a, Double b) {
        System.out.println("In double " + (a + b));
    }

    public static void main(String[] args) {
//        printSum(1, 2);
//        printSum('a','b');
//        printSum(new Integer(1), new Integer(2));

        int a = 1;
        int b = 1;
        int c = 1;
        c = a++ + ++a + a++;
        System.out.println(c + "" + a);

        a= b++ + (b+1) + ++b + (b=5) + ++b;
        System.out.println(a + "" + b);

        a = 1;
        int[][][] abc = new int[a][a=5][a++];
        System.out.println(abc.length + " " + abc[0].length + " " + abc[0][0].length);
        System.out.println(a);
    }

}
