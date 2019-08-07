package Inheritance;

/**
 * Created by aborisco on 2/19/2018.
 */
public class Lion extends Animal {

    public Lion(int age) {
        super(age);
        System.out.println(3);
    }

    public Lion() {
        this(4);                //or this or super
        System.out.println(4);
    }

//    public Lion() {
//        System.out.println("NOT COMPILE");
//        super(4);
//    }


//    public Lion() {
//        super(4);
//        System.out.println("NOT COMPILE");
//        super()
//    }



    private void roar() {
        System.out.println("The " + getAge() + " year old lion says: Roar!");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        Lion l = new Lion();
        a = (Lion)l;
        System.out.println(new Lion());
        Lion lion = new Lion();
        System.out.println(lion.getAge());
    }
}
