package AccessModifier.access;

/**
 * Created by aborisco on 2/13/2018.
 */
public class AccessTest {
    public static void main(String[] args) {
        ForAccessTest forAccessTest = new ForAccessTest();
        System.out.println(forAccessTest.def);
        System.out.println(forAccessTest.prot);
        System.out.println(forAccessTest.publ);
//        System.out.println(forAccessTest.priv);

    }
}
