package Inheritance;

/**
 * Created by aborisco on 4/3/2018.
 */
public class Additional extends One {

//    public Long init(){               wan't compile
//        return new Long(9);
//    }

    public int a = 15;
    public Integer init(){
    return new Integer(6);
}

    public static void main(String[] args) {
        One a = new Additional();
        System.out.println(a.init() + " " + a.a);

    }
}

class One{

    public int a = 10;
    public Number init(){
        return new Integer(5);
    }
}