package Exceptions.Checked;

/**
 * Created by aborisco on 2/23/2018.
 */
public class Err {
    public static void main(String[] args) throws InterruptedException {
        exc1();
        Thread.sleep(100);
        exc2();
        Thread.sleep(100);
        exc3();
    }

    private static void exc1() {
        try {
            System.out.println("throw ExceptionInInitializerError");
            Excp excp = new Excp();
        } catch (ExceptionInInitializerError e) {
            e.printStackTrace();
        }
    }

    private static void exc2() throws InterruptedException {
        try {
            Excp2 excp2 = new Excp2();
        } catch (ExceptionInInitializerError e) {
            System.out.println("throw ExceptionInInitializerError and then ");
        }

        try {
            System.out.println("throw NoClassDefFoundError ");
            Thread.sleep(100);
            Excp2 excp22 = new Excp2();
        } catch (NoClassDefFoundError e) {
            e.printStackTrace();
        }
    }

    private static void exc3() {
        try {
            exc3();
        } catch (StackOverflowError e) {
            System.out.println("throw StackOverflowError");
            e.getCause();
        }
    }
}

class Excp {

    static {
        String string = null;
        string.length();
    }
}


class Excp2 {
    static int undefined = 1 / 0;
}
