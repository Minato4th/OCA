package LambdasTest.AdditionalTest1;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by aborisco on 3/7/2018.
 */
public class LambdasTest {

    public static void test1(GiveString giveString){
        System.out.println(giveString.giveStr());
        System.out.println(giveString.tryMore());
    }

    public static void test2(VoidExample voidExample){
        voidExample.bringVoid();
    }

    public static void main(String[] args) {
        test1(() -> {
            System.out.println("Hello Motto");
            return "hello" + GiveString.to();});


        test2(() -> {
            System.out.println("Lets Go");
            int a = 10;
            int b = 15;
            System.out.println(a + b);
        });

        test2(System.out::println);

        GiveString giveString = () -> "hay";
        System.out.println(giveString.giveStr());


        List<String> strings = new LinkedList<>();
        strings.add("мама");
        strings.add("мыла");
        strings.add("раму");

        strings.forEach(x -> System.out.println(x));
        strings.forEach(System.out::println);
        strings.forEach(LambdasTest::staticMethod);

        LambdasTest instance = new LambdasTest();
        strings.forEach(instance::nonStaticMethod);
    }

    private static void staticMethod(String s) {
        System.out.println(s);
    }

    private void nonStaticMethod(String s) {
        // do something
    }
}
