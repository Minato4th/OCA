package Inheritance.StaticMethods;

/**
 * Created by aborisco on 2/19/2018.
 */
public class Marsupial {
    public static boolean isBiped() {
        return false;
    }

    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: " + isBiped());
    }

    public boolean isBiped2() {
        return false;
    }
    public void getMarsupialDescription2() {
        System.out.println("Marsupial walks on two legs: "+isBiped2());
    }
}
