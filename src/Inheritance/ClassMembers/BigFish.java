package Inheritance.ClassMembers;

/**
 * Created by aborisco on 2/19/2018.
 */
public class BigFish extends Fish {

    protected int a = 5;    //because a in previous class is private, or can be rewrite in any time
    public int b = 21;   //no  problem because it can be rewrite in any child class Hide value of super class

    public BigFish(int a) {
        super(a);
    }

}
