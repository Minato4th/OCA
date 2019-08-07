package Polymorphism;

public class Primate {

    public boolean hasHair() {
        return true;
    }
}

interface HasTail {
    public boolean isTailStriped();
}

class Lemur extends Primate implements HasTail {
    public boolean isTailStriped() {
        return false;
    }

    public int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        HasTail hasTail = lemur;
//        |
//      You will have only it methods but implementation of the class

//        System.out.println(hasTail.age); // DOES NOT COMPILE
//        System.out.println(hasTail.hasHair); // DOES NOT COMPILE

        System.out.println(hasTail.isTailStriped());
        Primate primate = lemur;
        System.out.println(primate.hasHair());

//        Lemur lemur2 = primate; // DOES NOT COMPILE
        Lemur lemur2 = (Lemur) primate;

        Primate primate1 = new Primate();
        lemur2 = (Lemur) primate1;          // will throw exception ClassCastException: Polymorphism


    }
}
