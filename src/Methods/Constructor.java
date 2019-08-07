package Methods;

/**
 * Created by aborisco on 2/14/2018.
 */
public class Constructor {

    int a;
    int b;
    final int c;
    final int d = 32;
//    private Constructor(){} required if we wont to protect creation of object and force to use static methods and var

    public Constructor(int a){
//        System.out.println("First constructor");
        this(a, 15);                            //this should be always first
        System.out.println("First constructor");
    }

    public Constructor(int a, int b){
//        this(a);                              //Recursive construction
        System.out.println("Second constructor");
        this.c = 25;
//        this.d = 45; can't assign to already assigned final value
    }


    public static void main(String[] args) {
        Constructor constructor = new Constructor(1);
    }
}
