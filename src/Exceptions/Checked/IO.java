package Exceptions.Checked;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by aborisco on 2/23/2018.
 */
public class IO {


    public static void main(String[] args) throws InterruptedException {
        exc1();
        Thread.sleep(100);
        exc2();
    }

    private static void exc1() {
        try {
            System.out.println("throw FileNotFoundException");
            Scanner scanner = new Scanner(new File("c"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void exc2() throws InterruptedException {
        try {
            System.out.println("throw IOException");                //it is general
            Thread.sleep(100);
            Scanner scanner = new Scanner(new File("c"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
