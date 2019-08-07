import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Trick {

    private static int f = a();

    private float dsdfs = 3F;


    private static int a(){
        return 1;
    }

    public static void main(String[] args) {

        Long date = LocalDate.now().toEpochDay();
        System.out.println(date);
        System.out.println(LocalDate.ofEpochDay(date));



        System.out.println(10 % 25);
        System.out.println((double)(2 / 4));

        System.out.println(LocalDate.now());
        System.out.println(OffsetDateTime.now());

        System.out.println(f);

        Long longi = 112334L;
        BigDecimal bd1 = BigDecimal.valueOf(1000.23);
        BigDecimal bd2 = BigDecimal.valueOf(1000);

        System.out.println("in ICS " + BigDecimal.valueOf(longi).divide(bd2, 2, BigDecimal.ROUND_HALF_UP));
        System.out.println("in IPS " + BigDecimal.valueOf(longi).multiply(bd2).longValue());
        System.out.println(bd1);

        Map<String, String> nf = new HashMap<>();
        nf.put("1", "Hell");
        nf.put("2", "None");

        System.out.println(nf.entrySet().stream()
                .map(Map.Entry::getValue)
                .collect(Collectors.joining(" ")));

        int a = 12;
        int a1 = a;
        int a2 = a;

        Integer b = 10;
        Integer b1 = b;
        Integer b2 = b;

        List<Integer> l = new ArrayList<>();
        l.add(1);
        List<Integer> l1 = l;
        List<Integer> l2 = l;

        a1 = 21;                //creates new link
        b1 = 25;                //creates new Object of class

        a2++;                   // creates new link
        b2++;                   //creates new Object of class

        l1.add(10);             //one reference for three variable
        l2 = new ArrayList<>(); // new object


        System.out.println(a + " " + b + " " + l);
        System.out.println(a1 + " " + b1 + " " + l1);
        System.out.println(a2 + " " + b2 + " " + l2);

        int num = 10;
        System.out.println(num-- + num++ + ++num);

        final String alfa;

        alfa = "some";

        System.out.println(alfa);




    }
}
