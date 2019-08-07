package Exceptions.Unchecked;

/**
 * Created by aborisco on 2/23/2018.
 */
public class RunEXCP {
    public static void main(String[] args) throws InterruptedException {
        exc1();
        Thread.sleep(100);
        exc2();
        Thread.sleep(100);
        exc3();
        Thread.sleep(100);
        exc4();
        Thread.sleep(100);
        exc5();
        Thread.sleep(100);
        exc6();

    }


    private static void exc1() {
        try {
            System.out.println("throw ArithmeticException");
            System.out.println(11 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }


    private static void exc2() {
        int[] ints = new int[2];
        try {
            System.out.println("throw IndexOutOfBoundsException");
            System.out.println(ints[10]);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    private static void exc3() {
        String type = "Mouse";
        Object obj = type;
        try {
            System.out.println("throw ClassCastException");
            System.out.println((Integer) obj);
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

    private static void exc4() {
        try {
            System.out.println("throw IllegalArgumentException");
            throw new IllegalArgumentException();                   //can be only throw
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    private static void exc5() {
        String str = null;
        try {
            System.out.println("throw NullPointerException");
            str.length();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    private static void exc6() {
        String str = null;
        try {
            System.out.println("throw NumberFormatException");
            Integer.valueOf("qwe");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
