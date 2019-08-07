import static Static.Static2.HELL;

/**
 * Created by aborisco on 3/25/2019.
 */
public class SomeTests{
    public static void main(String[] args) {
        System.out.println(some());
        final StringBuilder stringBuilder;
        stringBuilder = new StringBuilder("asda");
        stringBuilder.append('a');
        System.out.println(stringBuilder);
    }

    public static String some(){
        String str = "hell";
        switch ("Hello"){
            case "Hello":
                str = str + "rrrr";
            case "some":
                return str = str + "sone";
            case "man":
                return "hel";
        }

        return "";
    }

}