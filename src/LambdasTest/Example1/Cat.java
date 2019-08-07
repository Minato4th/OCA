package LambdasTest.Example1;

/**
 * Created by aborisco on 3/7/2018.
 */
public class Cat implements WithNameAndAge {
    private String name;
    private int age;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}