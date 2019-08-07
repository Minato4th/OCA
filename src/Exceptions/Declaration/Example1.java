package Exceptions.Declaration;

import java.io.IOException;

/**
 * Created by aborisco on 2/23/2018.
 */
public class Example1 {



//    public void bad() {
//        try {
//            eatCarrot();
//        } catch (IOException e ) {// DOES NOT COMPILE
//            System.out.print("sad rabbit");
//        }
//    }

    public void good() throws IOException {
        eatCarrot();
    }
    private static void eatCarrot() { }
}
