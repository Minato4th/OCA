package Polymorphism;

public class Poly {

    public static void main(String[] args) {

        C c = new C();

        A a = c;
        System.out.println(a.a());

//        System.out.println(a.b());        didn't see
//        System.out.println(a.c());        didn't see

        B b = c;
        System.out.println(b.a());
        System.out.println(b.b());
//        System.out.println(b.c());        didn't see

        C c1 = c;
        System.out.println(c.a());
        System.out.println(c.b());
        System.out.println(c.c());

        c1 = (C) a;                 // need to be casted    no Exception
        c1 = (C) b;                 // need to be casted    no Exception
        b = (B) a;                  // need to be casted    no Exception
        a = b;                      // no need to cast

        a = new A();
        b = new B();

        c = (C) a;                 // need to be casted     Exception thrown
        c = (C) b;                 // need to be casted     Exception thrown
    }
}

class A {
    public String a = "A";
    public String ab = "A";
    public String abc = "A";

    public String a() {
        return a;
    }

    public String ab(){
        return ab;
    }

    public String abc() {
        return abc;
    }
}

class B extends A {
    public String b = "B";
    public String ab = "AB";
    public String abc = "AB";

    public String b() {
        return b;
    }

    public String ab(){
        return ab;
    }

    public String abc() {
        return abc;
    }
}

class C extends B {
    public String c = "C";
    public String abc = "ABC";

    public String c() {
        return c;
    }

    public String abc() {
        return abc;
    }
}
