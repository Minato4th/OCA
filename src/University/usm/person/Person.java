package University.usm.person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by aborisco on 10/25/2018.
 */
public class Person {

    public static final int LEGAL_AGE = 18;

    private String name;
    private int age;
    private Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static List<Person> filterMan(List<Person> list, int age, Gender gender) {
        List<Person> menList = new ArrayList<>();
        for(Person person : list) {
            if(age <= person.getAge() && gender == person.getGender()) {
                menList.add(person);
            }
        }
        return menList;
    }

    public static List<Person> filterManWithStreamAPI(List<Person> list) {
        return list.stream()
                .filter(person -> person.getGender() == Gender.MALE && person.getAge() >= LEGAL_AGE)
                .collect(Collectors.toList());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
