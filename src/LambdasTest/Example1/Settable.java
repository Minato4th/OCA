package LambdasTest.Example1;

/**
 * Created by aborisco on 3/7/2018.
 */
public interface Settable<C extends WithNameAndAge> {
    void set(C entity, String name, int age);
}