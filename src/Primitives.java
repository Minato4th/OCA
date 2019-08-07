/**
 * Created by aborisco on 9/18/2018.
 */
public class Primitives {
    public static void main(String[] args) {
        byte a = 50, b = 40;
        byte c = (byte) (a + b);
        float f = a + b;
        double d = f;

        int x = 0, y = 0;
        System.out.println(x++ + ++y + x++ + ++y);//4
        System.out.println(x + "" + y);//2 + 2
        x = ++x;
        System.out.println(x);//3
        x+= ++x;
        System.out.println(x);//7

    }
}
