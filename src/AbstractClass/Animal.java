package AbstractClass;

/**
 * Created by aborisco on 2/20/2018.
 */
public abstract class Animal {

//    public abstract void swim() {} // DOES NOT COMPILE
//    public abstract int getAge() { // DOES NOT COMPILE
//        return 10;
//    }

//    public abstract final void chew(); // DOES NOT COMPILE can't be final

//    private abstract void sing(); // DOES NOT COMPILE  can't be private

    public static void main(String[] args) {
        final Animal eel = new Animal(){}; // compile because we try to override methods
//        final Animal eel = new Animal() // DOES NOT COMPILE
    }

}

class Cow extends Animal{
//    public abstract void peck(); // DOES NOT COMPILE
}

//public class Bird extends Animal { // DOES NOT COMPILE
//}
//
//class Flamingo extends Bird {     // will compile
//    public String getName() {
//        return "Flamingo";
//    }


//final abstract class Tortoise { // DOES NOT COMPILE   can't be final
//}
