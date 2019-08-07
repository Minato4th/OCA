package AccessModifier;

import AccessModifier.access.ForAccessTest;

/**
 * Created by aborisco on 2/12/2018.
 */
public class AccessModifier extends ForAccessTest {

//    public The method can be called from any class.
//    private The method can only be called from within the same class.
//    protected The method can only be called from classes in the same package or subclasses.
//    Default (Package Private) Access The method can only be called from classes in the same package.

    private void someMethod(){
        System.out.println(prot);   //inheritance
        System.out.println(publ);
    }

    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        System.out.println(accessModifier.prot);
        System.out.println(accessModifier.publ);
//        System.out.println(accessModifier.priv);
//        System.out.println(accessModifier.def);

        ForAccessTest forAccessTest = new ForAccessTest();
        System.out.println(forAccessTest.publ);
//        System.out.println(forAccessTest.prot);
//        System.out.println(forAccessTest.priv);
//        System.out.println(forAccessTest.def);
    }
}
