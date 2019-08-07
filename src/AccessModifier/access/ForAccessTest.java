package AccessModifier.access;

/**
 * Created by aborisco on 2/13/2018.
 */
public class ForAccessTest {

    int def = 10;
    public int publ = 11;
    private int priv = 12;
    protected int prot = 13;

    public static void main(String[] args) {
        ForAccessTest forAccessTest = new ForAccessTest();
        System.out.println(forAccessTest.publ);
        System.out.println(forAccessTest.def);
        System.out.println(forAccessTest.prot);
        System.out.println(forAccessTest.priv);
    }
}
