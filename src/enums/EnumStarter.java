package enums;

/**
 * Created by aborisco on 3/12/2019.
 */
public class EnumStarter {

    private int number = 0;

    public static void main(String[] args) {
        System.out.println(EnumToCompare.FALSE == EnumToCompare.FALSE);
        System.out.println(EnumToCompare.FALSE.equals(EnumToCompare.FALSE));
        System.out.println(EnumToCompare.FALSE.equals(null));
        System.out.println(EnumToCompare.FALSE == null);

        EnumStarter enumStarter = new EnumStarter();
        enumStarter.getObject(enumStarter);
    }

    public void changeNumber(){
        this.number = 10;
    }

    public void getObject(final EnumStarter enumStarter){
        enumStarter.changeNumber();
    }
}
