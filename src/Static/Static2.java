package Static;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aborisco on 2/13/2018.
 */
public class Static2 {

    public final static int INT = 15;
    public final static List LIST = new ArrayList();

    public final static int HELL;       //may not be Initialize, but if we insert static it will

    static {
        HELL = 24;
    }

    public static void main(String[] args) {
        Static1.main(args);
        System.out.println(Static1.a);

        Static1 static1 = new Static1();
        System.out.println(static1.a);      //is 10
        static1 = null;
        System.out.println(static1.a);      //is still 10

        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
//        System.out.println(counter1.i);     //it is 3

//        INT = 12;                 does not compile
//        LIST = new ArrayList();   does not compile
        LIST.add(25);   //will compile because we did not change object variable

    }
}
