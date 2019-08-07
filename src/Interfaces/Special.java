package Interfaces;

/**
 * Created by aborisco on 2/20/2018.
 */
public class Special {
}

interface Herbivore {
    public int eatPlants();
}
interface Omnivore {
    public void eatPlants();
}
//interface Supervore extends Herbivore, Omnivore {} // DOES NOT COMPILE            //because of conflict
//abstract class AbstractBear implements Herbivore, Omnivore {}// DOES NOT COMPILE  //because of conflict
