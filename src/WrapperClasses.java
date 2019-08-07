import java.util.ArrayList;
import java.util.List;

/**
 * Created by aborisco on 2/12/2018.
 */
public class WrapperClasses {

    // They all are immutable
    static Boolean aBoolean = new Boolean(Boolean.FALSE);
    static Byte aByte = new Byte((byte)1);
    static Short aShort = new Short((short)1);
    static Integer aInteger = new Integer(1);
    static Long aLong = new Long(1L);
    static Float aFloat = new Float(1.0);
    static Double aDouble = new Double(1.0);
    static Character character = new Character('a');

    public static void main(String[] args) {

        int int1 = aInteger.intValue();
        int1 = Integer.parseInt("123");     //Parse String to primitive
        //int1 = Integer.parseInt("1we3");  NumberFormatException
        aInteger = Integer.valueOf(int1);     //Parse String to wrapper class
//        aInteger = Integer.valueOf(12.3); can't
//        aInteger = Integer.valueOf("12.8"); NumberFormatException

        //Character doesn't have methods for boxing and unboxing

        //Autoboxing

        List<Double> list = new ArrayList<>();
        list.add(60.5);                 //Autoboxing
        //list.add(5);                  can't add because it is int, need to cats
        list.add(new Double(5));
        double d = list.get(0);         //Autoboxing
        list.add(null);
        //d = list.get(2);              //NullPointerException

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(1);                   // removes by index not a number
        numbers.remove(new Integer(1));      // removes by a number
        System.out.println(numbers);               // empty


        Boolean bool1 = Boolean.valueOf("FaLSe");
        System.out.println(bool1.booleanValue());

        Long long1 = Long.valueOf(127);
        Long long2 = Long.valueOf(127);
        System.out.println(long1 == long2);     //true

        long1 = Long.valueOf(255);
        long2 = Long.valueOf(255);
        System.out.println(long1 == long2);     //false

    }
}
