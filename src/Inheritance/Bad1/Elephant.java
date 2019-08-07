package Inheritance.Bad1;

/**
 * Created by aborisco on 2/19/2018.
 */
public class Elephant extends Mammal {

    // will not compile if no default constructor


//    public Elephant() { also super class have not such constructor
//    }

    public Elephant(int a) {
        super(a);
    }
}
