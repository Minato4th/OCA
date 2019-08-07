package Inheritance.ClassMembers;

/**
 * Created by aborisco on 2/19/2018.
 */
public class Shark extends BigFish {

    private int e;      // hidden value
    private int c;
    public int b;

    public Shark(int a) {
        super(a);
        this.b = 12;
        this.c = 13;
        this.d = 14;
    }

    public Shark(int a, int b) {
        super(a);
//        super.b = b;
        super.c = 13;
        super.d = 14;
        this.c = 20;
        this.e = 40;
        this.b = 50;
    }

    public void showNumbers(){
        System.out.println(getA() + " " + a + " " + super.b + " " + super.c + " " + d + " " + this.c + " " + this.e + " " + this.b);
        //this call current values, but supper call values from super class
        // b of the mother class will be hidden by second child, so third will not see it
    }

    public static void main(String[] args) {
        Shark shark = new Shark(11, 12);
        shark.showNumbers();
    }
}
