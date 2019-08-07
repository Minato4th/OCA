package Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by aborisco on 2/21/2018.
 */
public class Try {

    public static void main(String[] args) {

        try {
            int x = 0 / 0;
        } catch (Exception ex){
            System.out.println(ex);
            System.out.println();
            System.out.println(ex.getStackTrace());
            System.out.println();
            System.out.println(ex.getMessage());
            System.out.println();
            System.out.println(ex.getCause());
        }



        try {
            throwExeption();
        }catch (IOException e){
            System.out.println("first");
            try {
                throwExeption();
            } catch (IOException e1) {
                System.out.println("second");
            } finally {
                System.out.println("");
            }
        }


    }

    public static String throwExeption() throws IOException {




        throw new IOException();
    }
}
