package Additional;


import java.io.IOException;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

interface I {
    int c = 10;

    void a();
}

interface T {
//    public static final int c = 15;
}

class A implements I, T {

    public static void m1(){}

    public static final int c;
    static {
        c = 10;
    }

    final int vbn = 2;

    int abc(int a){
        System.out.println("A");

        return a*10;
    }

    public void a() {
        System.out.println("aa");
    }
}

class B extends A {

    public static void m1(){}

    int vbn = 2;

//    public void m1(){}
    void some() throws IOException {
    }

    int abc(int a){
        System.out.println("B");

        return super.abc(a*5);
    }
}

class C extends B {
    int abc(int a){
        System.out.println("C");
        return super.abc(a);
    }

    void some() {
    }



    void a(Object b) {
        System.out.println("ac");
    }

    void c() {
        System.out.println("c");
    }
}

public class Inheritance {

    public static int j;

    void showJ () {
        while (j <= 5) {
            for (int j = 1; j <= 5; ) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println(j);
            j++;
        }
    }


    public static void main(String[] args) {


        for (int i = 0; i<10; ++i) {
            System.out.print(i);
        }
        System.out.println();

        for (int i = 0; i<10; i++) {
            System.out.print(i);
        }

        new Inheritance().showJ();

        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println(b.vbn);

        System.out.println(A.c);
        a= new C();
        a.abc(1);


        a.a();


        a = new C();
        a.a();
        a.a();
        //a.c();


//        a = (B)(I)b;
//        a = new A();
//        b = new B();
//        b = (B)(I) a;
//
//        a = new A();
//        b = new B();
//        a = (I) b;

                int x1 = -4;        //-4
                int x2 = x1--;      //-5, -4
                int x3 = ++x2;      //-5, -3, -3
                if(x2 > x3){        //false
                    --x3;
                }else{
                    x1++;           //-4, -3, -3
                }

                System.out.println(x1 + x2 + x3);
        {
            System.out.println("hell");
        }

                new Object().equals(new Object());


        int i1 = 1, i2 = 2, i3 = 3;
        int i4 = i1 + (i2=i3 );
        System.out.println(i4);

        System.out.println("a".concat(" b").trim().equals("a b"));
        System.out.println("sd".compareTo("d"));

//        ""++;

        int ir[][] = new int[8][2];
        System.out.println(ir[2][1]);


                List list = new ArrayList();
                list.add("val1"); //1
                list.add(0, "val2"); //2
                list.add(0, "val3"); //3
                System.out.println(list);

                double ewr = 0.3;
//                long bnm = (long) ewr*0.5;

        int adf = 5;
        float fdsa = 10;
        System.out.println(adf == fdsa);



        int i = 3;

            switch(i){
                case 1: System.out.println("B");
                case 2: System.out.println("C");
                case 3: System.out.println("D");
                case 4: System.out.println("E");
            }

        Period.ofDays(10);
    }
}