package Interfaces;

/**
 * Created by aborisco on 2/20/2018.
 */
public class DefaultMethodInheritance {
}

interface Walk {
    public default int getSpeed() {
        return 5;
    }
}

interface Run {
    public default int getSpeed() {
        return 10;
    }
}

//class Cat implements Walk, Run {              // DOES NOT COMPILE
//    public static void main(String[] args) {
//        System.out.println(new Cat().getSpeed());
//    }
//}

class Cat implements Walk, Run {                //will compile
    public int getSpeed() {
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(new Cat().getSpeed());
    }
}