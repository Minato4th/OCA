package Inheritance;

/**
 * Created by aborisco on 2/19/2018.
 */
public class Animal {

    private int age;        //no accessible value

    public Animal(int age) {
        super();
        this.age = age;
        System.out.println(2);
    }

    public Animal() {
        System.out.println(1);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
