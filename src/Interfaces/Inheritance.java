package Interfaces;

/**
 * Created by aborisco on 2/20/2018.
 */
public class Inheritance {
    public static void main(String[] args) {
        System.out.println(Simple.NAME);
    }
}

interface HasTail {
    int g = 0;
    public int getTailLength();
    public int getTailLength(int p);
//    public int eatPlants();                           // will not compile
}

interface HasWhiskers {
    public int getNumberOfWhiskers();
    public int getTailLength();                     // will work fine
    public int getTailLength(String s);              // will work fine
//    public void eatPlants();                      //will not compile
}

interface Seal extends HasTail, HasWhiskers {
}

abstract class HasSome implements HasTail, HasWhiskers {
    // no need to implement something
    public abstract int getTailLength();            //can rewrite
    public int getNumberOfWhiskers(){return 1;}     //or implement
}

class DoSome implements HasTail, HasWhiskers{

    @Override
    public int getNumberOfWhiskers() {
        return 0;
    }

    @Override
    public int getTailLength() {
        return 0;
    }

    @Override
    public int getTailLength(String s) {
        return 0;
    }

    @Override
    public int getTailLength(int p) {
        return 0;
    }

}


//interface Seal2 extends Inheritance, HasSome {          couldn't extends other class
//}

//interface Seal implements Inheritance or HasWhiskers  { couldn't implements
//}
