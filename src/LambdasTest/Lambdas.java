package LambdasTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aborisco on 2/19/2018.
 */
public class Lambdas {

//    print(() -> true); // 0 parameters
//    print(a -> a.startsWith("test")); // 1 parameter
//    print((String a) -> a.startsWith("test")); // 1 parameter
//    print((a, b) -> a.startsWith("test")); // 2 parameters
//    print((String a, String b) -> a.startsWith("test")); // 2 parameters


//    print(a, b -> a.startsWith("test")); // DOES NOT COMPILE
//    print(a -> { a.startsWith("test"); }); // DOES NOT COMPILE
//    print(a -> { return a.startsWith("test") }); // DOES NOT COMPILE


//    (a, b) -> { int c = 0; return 5;}
//    (a, b) -> { int a = 0; return 5;} // DOES NOT COMPILE

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("hello");
        list.add("Asdf");

        System.out.println(list);
        list.removeIf(a -> a.charAt(0) == 'H');
        System.out.println(list);

    }
}
