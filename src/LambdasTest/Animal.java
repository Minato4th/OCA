package LambdasTest;

/**
 * Created by aborisco on 2/19/2018.
 */
public class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String species, boolean canHop, boolean canSwim) {
        this.species = species;
        this.canHop = canHop;
        this.canSwim = canSwim;
    }

    public boolean canHop(){
        return canHop;
    }

    public boolean canSwim() { return canSwim; }
    public String toString() { return species; }
}
