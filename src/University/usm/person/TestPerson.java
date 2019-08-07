package University.usm.person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static University.usm.person.Gender.*;

/**
 * Created by aborisco on 10/25/2018.
 */
public class TestPerson {

    public static void main(String[] args) {
        Person vasea = new Person("Vasea", 22, MALE);

        List<Person> personList = new ArrayList<>();
        personList.add(vasea);

        System.out.println(Person.filterManWithStreamAPI(Arrays.asList(
                new Person("Vasea", 22, MALE),
                new Person("Ann", 22, FEMALE),
                new Person("Petru", 5, MALE))
        ));

        System.out.println(Person.filterMan(Arrays.asList(
                new Person("Vasea", 22, MALE),
                new Person("Ann", 22, FEMALE),
                new Person("Petru", 5, MALE))
        , 21, FEMALE));
    }
}
