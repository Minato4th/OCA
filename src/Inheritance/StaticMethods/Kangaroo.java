package Inheritance.StaticMethods;

/**
 * Created by aborisco on 2/19/2018.
 */
public class Kangaroo extends Marsupial {
    public static boolean isBiped() {
        return true;
    }

    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: " + isBiped());
    }

    public boolean isBiped2() {
        return true;
    }

    public void getKangarooDescription2() {
        System.out.println("Kangaroo hops on two legs: " + isBiped2());
    }

    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription();     // took from super class
        joey.getKangarooDescription();      // took from child class
        joey.getMarsupialDescription2();    // took from child
        joey.getKangarooDescription2();     // took from child
    }
}
