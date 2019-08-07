package Polymorphism;

public class PolyUpper {

    public static void main(String[] args) {
        A a = new A();

        B b = new B();

        C c = new C();

        a = c;
        b = c;
        c = c;

        System.out.println(a.ab);               // use its own parameter
        System.out.println(a.ab());             // but use last overrated method
        System.out.println(a.abc);              // use its own parameter
        System.out.println(a.abc());            // but use last overrated method


        System.out.println();
        System.out.println(b.ab);              // use its own parameter
        System.out.println(b.ab());            // but use last overrated method
        System.out.println(b.abc);
        System.out.println(b.abc());


        System.out.println();
        System.out.println(c.ab);              // use its own parameter that is equal to AB in B class
        System.out.println(c.ab());            // but use last overrated method
        System.out.println(c.abc);
        System.out.println(c.abc());
    }
}


