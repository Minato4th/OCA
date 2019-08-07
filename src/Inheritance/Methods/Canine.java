package Inheritance.Methods;

/**
 * Created by aborisco on 2/19/2018.
 */
public class Canine {
    public double getAverageWeight() {      //1 rule
        return 50;
    }

    public double a(){                      //2
        return 5;
    }

    protected String getNumberOfHumps() {   //4 covariant
        return "Undefined";
    }

    protected boolean hasLegs() throws NumberFormatException {  //3
        throw new NumberFormatException();
    }
    protected double getWeight() throws Exception {             //3
        return 2;
    }


    protected double getHeight() throws NumberFormatException { //3
        return 2;
    }

    protected int getLength() {                                 //3
        return 10;
    }

    private String getNumberOfHumpsPrivate() {                  //private
        return "Undefined";
    }

    public Number number(){
        return 1;
    }
}
