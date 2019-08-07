package Methods;

/**
 * Created by aborisco on 2/14/2018.
 */
public class Method {

    public int asdf = 100;
    public static int fdsa = 100;

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("One");
        webby(stringBuilder);
        System.out.println(stringBuilder);              //One Hell

        int i = 10;
        plus(i);
        System.out.println(i);                          //10

        vararg1(new int[]{1,2,3,4});
        vararg2(new int[]{1,2,3,4});
//        vararg1(1,2,3,4);             does not compile, because only vararg can take numbers like this
        vararg2(1,2,3,4);
        vararg2(1,2,3);         // will choose simple 3 int method
        vararg2(1);         // will choose simple 3 int method

        int1(new Integer(5));
        int2(3);
        int2(new Integer(2));
        int3(15);


        li1(12);            //find best
        li1(12L);           //find best
        li2(12);            //auto casting
        li3((short) 12L);     //need to cast

//        l1(15);           Can't do conversion twice
        l1(15L);

    }

    private static void webby(StringBuilder webb){
        webb.append(" Hell");
    }

    private static void plus(int i){
        i = 25;
    }

    public void fly(int numMiles) { }
    public void fly(short numFeet) { }
    public boolean fly() { return false; }
    void fly(int numMiles, short numFeet) { }
    public void fly(short numFeet, int numMiles) throws Exception { }



//    public int fly();             You can't change return type if it have same request values
//    public int fly(int num);
//    public int fly(int numMiles, short numFeet) throws Exception { }
//    public void fly(int numFeet, short numMiles) throws Exception { }
//                                  Access modifiers, static and Exceptions did not influence on Overloading

    public void fly(int[] lengths) { }
//    public void fly(int... lengths) { } // DOES NOT COMPILE

    public static void vararg1(int[] i){
        System.out.println("array");
    }

    public static void vararg2(int... i){
        System.out.println("vararg");
    }

    public static void vararg2(int i, int c, int f){
        System.out.println("simple");
    }

    public static void vararg2(int i){
        System.out.println("the one");
    }

    private  static void int1(int i){ System.out.println("in int1"); }              //autocasting
    private  static void int2(int i){System.out.println("in int2 - int"); }         // will choose that what he need
    private  static void int2(Integer i){System.out.println("in int2 - Integer"); }
    private  static void int3(Integer i){System.out.println("in int3 - Integer"); }

    private static void li1(int i){}
    private static void li1(long l){}
    private static void li2(long l){}
    private static void li3(short s){}

    private static void l1(Long l){}
    private static void l1(Long... l){}

    private static void returnSome(){
        return;
//        return 5;                     will not compile, because it is void
//        int a = 15;                   will not compile
    }

    private static void returnIfSome(){
        if (5 > 10){
            return;                     // should be the lest that will be done in method
//            int r = 25;               not the last, so will not compile
        } else {
            int a = 13;
        }

        int b = 13;
    }

}
