package LambdasTest.AdditionalTest1;

/**
 * Created by aborisco on 3/7/2018.
 */
public interface GiveString {
    String giveStr();

    default String tryMore(){
        return giveStr();
    }

    static String to(){
        return "yes we can";
    }
}
