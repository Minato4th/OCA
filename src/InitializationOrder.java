/**
 * Created by aborisco on 1/22/2018.
 */
public class InitializationOrder {

    //superclass
    //Static variable declarations and static initializers in the order they appear in the file.
    //Instance variable declarations and instance initializers in the order they appear in the file.
    //constructor


    private final String NAME = "Hell1";                    //3
    private final String SECOND_NAME;                       //3 - waits initialization
    private String name = "Fluffy";                         //3

    { System.out.println("setting field"); }                //4

    public InitializationOrder(){                           //5
//        this(name);                                       // don't do like that
        this("hello");
        name = "Tiny";
        System.out.println("setting first constructor");
    }

    public InitializationOrder(String a){                   //5
        this.SECOND_NAME = a;
        System.out.println("setting second constructor");
    }

    public final static String ST1;                         //1 - waits initialization

    public static String st1= "new";                        //1

    static {                                                //2
        ST1 = "asd";
        System.out.println("Setting static");
    }

    public static void main(String[] args) {
        System.out.println("Lets Begin");                   //wil be print after static field
        InitializationOrder initializationOrder = new InitializationOrder();
        System.out.println(initializationOrder.name);
    }

    private int b;

    /*{ System.out.println(same); } // DOES NOT COMPILE because of order`
    private String same = "Fluffy";*/

    /*static {                      //also does not compile because of order
        System.out.println(name);
    }
    public static String name = "Hell";*/
}
