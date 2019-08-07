package AbstractClass;

/**
 * Created by aborisco on 2/20/2018.
 */
public abstract class Animal2 {
    public abstract String getName();
    public abstract String getSurname();
    public abstract boolean isHere();
}

abstract class BigCat extends Animal2 {
    public abstract void roar();
    public String getSurname(){                 // implemented here
        return "BigCat";
    }
    public abstract boolean isHere();           //WORKS FINE

}

class Lion extends BigCat {
    public String getName() {
        return "Lion";
    }

    public boolean isHere() {
        return false;
    }

    public void roar() {
        System.out.println("The Lion lets out a loud ROAR!");
    }
}

// we can create abstract class that extends simple class
abstract class Animal3 extends BigCat {         //works fine
    public abstract String getName();
    public abstract String getSurname();
    public abstract boolean isHere();
}
