import java.util.Collections;
import java.util.Map;

/**
 * Created by aborisco on 7/30/2018.
 */
public class ClassInitialization {

    private final Integer one;

    private final Integer two;

//    private final Integer three = two; won't work

    public ClassInitialization(Integer one, Integer two) {
        this.one = one;
        this.two = two;
    }

    public static void main(String[] args) {
        ClassInitialization classInitialization = new ClassInitialization(1,2);
        System.out.println(classInitialization);
    }
}
