import java.util.ArrayList;

/**
 * Created by aborisco on 2/5/2018.
 */
public class Statements {

    public static void main(String[] args) {
        int y =10;

//        int animal = (y < 91) ? 9 : "Horse";      one data type for all parts
//        String animal = (y < 91) ? 9 : "Horse";

        Double d = 5.5D;

        switch (d.intValue()){                      //only byte char short int ENUM, but can be cast
            default:
                System.out.println("Default");      //anyway will enter  last
                break;
            case 5:                                 //only byte char short int ENUM
                System.out.println("first");
                break;
            case 6 :
                System.out.println("second");
                break;
        }

        int i = 10;
        switch (i){
            case 5:
                System.out.println("first");
                break;                          //will not enter
            default:
                System.out.println("Default");  //will be entered as last, but won't stop
            case 6 :
                System.out.println("second");   //is the last so this will be the last statement after Default
                                                //if default is last only one will be printed
        }

        System.out.println();
        final int i2 = 13;                      //should be final
        switch (i){
            case i2:
                System.out.println("12");       // will not printed
            case 10:
                System.out.println("first");    // will not stop and go next down
            case 4:
                System.out.println("additional"); // also will be printed
            case 7:
                System.out.println("some");
                break;                           //will stop here
            default:
                System.out.println("Default");  //if no break as he still didn't stop stop go next
            case 6 :
                System.out.println("second");   //if no break also prints
        }

        switch (i){
                            //it is good
        }

        ArrayList<Integer> inter = new ArrayList<>();

    }

    private int getSortOrder(String firstName, final String lastName) {
        String middleName = "Patricia";
        final String suffix = "JR";         //shood be final in order to compile
        int id = 0;
        switch(firstName) {
            case "Test":
                return 52;
//            case middleName: // DOES NOT COMPILE
//            id = 5;
//            break;
            case suffix:
                id = 0;
            break;
//            case lastName: // DOES NOT COMPILE
//                id = 8;
//            break;
//            case 5: // DOES NOT COMPILE
//                id = 7;
//            break;
//            case 'J': // DOES NOT COMPILE
//                id = 10;
//            break;
//            case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
//                id=15;
//            break;
            }
            return id;
            }
}
