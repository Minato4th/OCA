package Additional;

import java.util.ArrayList;
import java.util.List;

import static java.time.format.DateTimeFormatter.ISO_DATE_TIME;

class Q{
    public Number code() throws Exception{return 1;}
    public int i = 5;
}

class QQ extends Q{
    public Integer code(){return 1;}
    private int i = 10;
}

class QQQ extends QQ{
    public Integer code(){return 3;}
}

interface W{
    public static void wow(){
        System.out.println("W");
    }
}


abstract class WW implements W{
    public static void wow(){
        System.out.println("WW");
    }
}

class WWW extends WW{

}

public class OneMore {
    public static void main(String[] args) {
        boolean b1 = false;
        boolean b2 = false;

        System.out.println(b1=b2 == false);
        Q q = new QQ();
        ((QQ)q).code();
//        System.out.println(((QQ)q).i);

        System.out.println(new Integer(5).equals(new Long(5)));

        for (int i = 0; i <10; i++) {
            ;
        }

        WWW w = new WWW();
        ((WW)w).wow();

        List<Integer> list = new ArrayList<>();

    }
}
