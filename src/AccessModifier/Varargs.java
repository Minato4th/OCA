package AccessModifier;

/**
 * Created by aborisco on 2/13/2018.
 */
public class Varargs {

    private static void test(int i1, int... i2){
        //System.out.println(i2.length);
    }

    private static void test2(Integer i1, Integer... i2){
        System.out.println(i2);
    }

    public static void main(String[] args) {
        test(1,2);
        test(1,2,3,4,5,6);
        test(1, new int[]{1,2,3});
        test(1,null);// will thrown NullPointerException when parameter will be call
//        test(1, new int[][]{{1,2},{1,2}});does not compile

        test2(1, null); // fine for objects
    }
}
