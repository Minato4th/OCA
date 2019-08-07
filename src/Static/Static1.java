package Static;

/**
 * Created by aborisco on 2/13/2018.
 */
public class Static1 {

    public static int a = 10;
    public int c = 10;
    private int b = a;
//    public static int c = b; won't work


    public static void main(String[] args) {
        System.out.println(a);
        Counter counter = new Counter();
//        System.out.println(b); also can be accessed

    }

    public int method(){
        return 1;
    }
}
