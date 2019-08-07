package Interfaces;

/**
 * Created by aborisco on 2/20/2018.
 */
public class DefaultMethod {
}

interface IsWarmBlooded {
    boolean hasScales();

    public default double getTemperature() {
        return 10.0;
    }

//    public final default double getTemperature() {        will not compile
//        return 10.0;
//    }
//
//    public static default double getTemperature() {       will not compile
//        return 10.0;
//    }
//
//    protected default double getTemperature() {        will not compile
//        return 10.0;
//    }
//
//    private static default double getTemperature() {       will not compile
//        return 10.0;
//    }

    public default int getNumberOfFins() {
        return 4;
    }
    public default double getLongestFinLength() {
        return 20.0;
    }
    public default boolean doFinsHaveScales() {
        return true;
    }
}

interface SharkFamily extends IsWarmBlooded {
    public default int getNumberOfFins() {
        return 8;
    }
    public double getLongestFinLength();
//    public boolean doFinsHaveScales() { // DOES NOT COMPILE
//        return false;
//    }
}