package Inheritance.Methods;

/**
 * Created by aborisco on 2/19/2018.
 */
public class Wolf extends Canine {

    public Integer number(){
        return new Integer(5);
    }

    public double getAverageWeight() {          //1
        return super.getAverageWeight() + 20;
    }

    /*public double getAverageWeight() {
        return getAverageWeight()+20; // INFINITE LOOP
    }*/

    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());
    }


    /*protected double a(){             2 should be great or equal than public
        return 3;
    }*/

    /*private int getNumberOfHumps() { // DOES NOT COMPILE      //4
        return 2;
    }*/

    protected boolean hasLegs() {                               //3
        return false;
    }
    protected double getWeight() throws NumberFormatException{  //3
        return 2;
    }

    /*protected double getHeight() throws Exception { // DOES NOT COMPILE
        return 2;
    }*/

   /* protected int getLength() throws Exception { // DOES NOT COMPILE          not for all time
        return 10;
    }*/

    private int getNumberOfHumpsPrivate() {                     //private
        return 2;
    }

}
