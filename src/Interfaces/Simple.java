package Interfaces;

/**
 * Created by aborisco on 2/20/2018.
 */
public abstract interface Simple {
    public static final String NAME = "neme";
    public final String NAME2 = "neme";
    final String NAME3 = "neme";
    String NAME4 = "neme";
//    String NAME5;                 will not compile because they are final and must be uninitialized

    public abstract int number();
    public int number2();
    int number3();

    public static int getJumpHeight(){
        return 10;
    }

//    public static final int getJumpHeight(){          or static or final
//        return 10;
//    }

//    public static abstract int getJumpHeight(){       can't be abstract
//        return 10;
//    }
}

// Bad examples
//private final interface CanCrawl { // DOES NOT COMPILE
//    private void dig(int depth); // DOES NOT COMPILE
//    protected abstract double depth(); // DOES NOT COMPILE
//    public final void surface(); // DOES NOT COMPILE
//}