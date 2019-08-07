package LambdasTest;

/**
 * Created by aborisco on 2/19/2018.
 */
public class CheckIfHopper implements CheckTrait {

    @Override
    public boolean test(Animal a) {
        return a.canHop();
    }
}
