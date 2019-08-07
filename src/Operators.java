import java.util.Objects;

/**
 * Created by aborisco on 1/30/2018.
 */
public class Operators {
    public static void main(String[] args) {

        //binary operators (for all except String(except +) and boolean)
        System.out.println(2 * 5 + 3 * 4 - 8);
        System.out.println(2 * ((5 + 3) * 4 - 8));
        System.out.println(10 / 3); // Outputs 3
        System.out.println(10 % 3); // Output 1
        System.out.println(3 % 10); // Output always 3
        System.out.println(-10 % -3); // Sign always depends from 1st number


        //numeric promotion
        //different data types
        int x = 10;
        long y = 15;
        long z = x * y;
        //int z = x * y; will not compile because you need to cast it

        //integral and the other is floating-point
        double d = 39.21;
        //float f = 2.1; will not compile
        System.out.println(d * x);


        //byte, short, and char, are first promoted to int
        byte b1 = 5;
        byte b2 = 10;

        char c1 = 'h';
        char c2 = 95;

        short s1 = 10;
        short s2 = 3;

        int in =  s1 / s2; // will compile without dot
        float fl = s1 / s2;
        double d1 = s1 / s2;
        System.out.println(in + " " + fl + " " + d1);

        //s1 = b1 + b2; will not compile
        //c1 = b1 + b2; also will not compile
        // and other like this, they always will promoted to int and higher, except the =

        s1 = b1;
        //s1 = c1 and c1 = b1 will not compile because need to cast to char


        //Unary Operators
        boolean bo1 = false;
        boolean bo2 = !bo1; // will be true
        bo1 = !bo1;         // will be false


        int ini1 = 5;
        ini1 = - ini1; //will print -5

//        int x = !5; // DOES NOT COMPILE
//        boolean y = -true; // DOES NOT COMPILE
//        boolean z = !0; // DOES NOT COMPILE


        //Increment and Decrement Operators they will be done at the first step

        int counter = 0;
        System.out.println(counter); // Outputs 0
        System.out.println(++counter); // Outputs 1
        System.out.println(counter); // Outputs 1
        System.out.println(counter--); // Outputs 1
        System.out.println(counter); // Outputs 0

        int inc = 3;

        System.out.println(inc++ + ++inc); // 8
        inc = 0;
        System.out.println(inc + ++inc); // 7
        inc = 0;
        System.out.println(inc++ + inc); // 7
        inc = 0;
        System.out.println(inc + inc); // 6


        inc = 3;

        inc = ++inc;
        inc = inc++;
//        int i=0;
//        for(int k=0;k<10;k++){
//            int j = 0;
//            i = j;
//            j = j + 1;
//        }
        System.out.println(inc); // 4

        inc = 3;
        int dec = ++inc * 5 / inc-- + --inc; //20/4 + 2 = 7
        // will     |           |       |
        //          4           4       2       from left to right, paste only result of this operation

        //Using Additional Binary Operators
        //Assignment Operators

        int i2 = 1;

        float f2 = 3.4028235E38f * 20f; // infinity
        double d2 = 3.142E-320 / 100000; // 0

        //Compound Assignment Operators
        long l5 = 10;
        int i5 = 5;
        //i5 = i5 * l5; // DOES NOT COMPILE
        i5 *= l5; // will compile

        l5 = (i5 = 10); // i5 and l5 will be 10

        l5 += (i5 = 10) + (l5 = 16); // 36 or  10 + 10 + 16
        l5 = (i5 = 10) + (l5 = 16) + l5; // 42 or  10 + 16 + 16


        //Equality Operators
        String str1 = "Hell";
        String str2 = "some";
        String str3 = str2;
        String str4 = "Hell";
        String str5 = new String("Hell");

        System.out.println(str1 == str2);   //false
        System.out.println(str3 == str2);   //true because it references to same object
        System.out.println(str1 == str4);   //true because Java found out that one object with this content already exist so str1 and str4 point to the same object in memory
        System.out.println(str1 == str5);   //these objects are different, but have same content
        System.out.println(str1.equals(str5)); // will print true, content is same
        System.out.println(str1 instanceof String);//true same class

        Long lg = new Long(25L);
        Long lg2 = new Long(25L);
        lg = 2345L;
        lg2 = 2345L;
        System.out.println(lg.equals(lg2)); // will print true, content is same
        System.out.println(Objects.equals(lg, lg2)); // will print true, content is same
        System.out.println(lg == lg2); // will print false, different objects from 128L


        int int1 = 10;
        long long1 = 10;
        short short1 = 10;
        System.out.println(int1 + short1 + long1);

        System.out.println(10-4*-2);
        int a = '1';
        System.out.println(a);

    }
}
