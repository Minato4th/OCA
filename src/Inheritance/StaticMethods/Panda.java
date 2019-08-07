package Inheritance.StaticMethods;

/**
 * Created by aborisco on 2/19/2018.
 */
public class Panda extends Bear {
    public static void eat() {
        System.out.println("Panda bear is chewing");
    }

    /*public void sneeze() { // DOES NOT COMPILE            cant be downgraded from static to non static
        System.out.println("Panda bear sneezes quietly");
    }

    public static void hibernate() { // DOES NOT COMPILE     cant become static
        System.out.println("Panda bear is going to sleep");
    }*/

    public static void main(String[] args) {
        Panda.eat();
        Bear.eat();
    }
}
