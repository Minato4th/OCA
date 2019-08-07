package LambdasTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aborisco on 2/19/2018.
 */
public class TraditionalSearch {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>(); // list of animals
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));
        animals.add(new Animal("my", true, true));

        print(animals, new CheckIfHopper()); // pass class that does check
        print(animals, a -> a.canHop());
        print(animals, Animal::canHop);
        print(animals, a -> a.canSwim());
        print(animals, a -> true);

        //CheckTrait a = (Animal b) -> { return b.canSwim();};


    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) // the general check
                System.out.print(animal + " ");
        }
        System.out.println();
    }

    private static void print(CheckTrait checker) {

        System.out.println();
    }

}
