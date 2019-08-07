/**
 * Created by aborisco on 10/4/2017.
 */
public class OrderInitialization {


}


/*first initialize instance, blocks and than constructor(only when we create )
  order have a matter

 */
class Chick {
    private String name = "Fluffy"; //1

    {
        System.out.println("setting field");
        System.out.println("name " + name);
    } //2

    public Chick() {
        System.out.println("name still " + name);
        name = "Tiny";
        System.out.println("setting constructor");
    } //3

    public static void main(String[] args) {

        Chick chick = new Chick();//3
        System.out.println("new name " + chick.name);//4
    }
}