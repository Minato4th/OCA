import java.util.*;


interface D{

    void d1();
}

abstract class C implements D{

    public int c = 13;

    abstract public void c1();
}


class A extends C{

//    public A(String a) {
//        this.a = a;
//    }

    public A(){

    }

    public String a = "A";

    @Override
    public void c1() {
        System.out.println(super.c);
    }

    @Override
    public void d1() {
        System.out.println("D");
    }
}

class B extends  A{

//    public B() {
//        super("hell");
//
//    }

    public B(){
        super();

    }

    public String a = "B";

    public String b = "BB";

    public void superA(){
        System.out.println(super.a);
    }

}



public class Tests {



    public static void main(String...args) {

        String e = "";

        Optional<String> opa = Optional.empty();
        Optional<String> opa2 = Optional.ofNullable(e);


        System.out.println(opa + " " + opa2);
        System.out.println(opa.orElse("Hell") + " " + opa2.orElse(null));



        A dfd = null;
        System.out.println(Objects.isNull(dfd));
        System.out.println(dfd == null);


        C c = new B();
        A a = new A();
        A ab = new B();
        B b = new B();


        System.out.println(a.a);
        System.out.println(ab.a);
        System.out.println(b.a);

        System.out.println(a.c);
        System.out.println(ab.c);
        System.out.println(b.c);


        List<String[]> bnm = new ArrayList<>();
        bnm.sort((o1, o2) -> {
            int length1 = 0;
            int length2 = 0;
            for (String s : o1) {
                length1 += s.length();
            }
            for (String s : o2) {
                length2 += s.length();
            }
            return length1 - length2;
        });

        bnm.forEach(System.out::println);


//        //int a = 1_0_0_0_0_0;
//        int max = 0b1010;
//
//        Long a = 1L;
//        Long b = 2L;
//        long c = 2;
//        System.out.println(a + " " + b);
//
//        b=a;
//        System.out.println(a + " " + b);
//
//        Tests tests = new Tests();
//        System.out.println(tests.b);



//        double x = 2.00;
//        double y = 1.10;

//        float value = 102.0f;
//        float value1 = 102;
//        float value2 = (int)102.0;
//        float value3 = 1f * 0.0;
//        float value4 = 1f * (short)0.0;
//        float value5 = 1f * (boolean)0;

//        int x = 0;
//        while(++x < 5) {  x+=1; }
//        String message = x > 5 ? "Greater than" : "Less Than";
//        System.out.println(message+","+x);

//        System.out.println(OffsetTime.now().getOffset().getTotalSeconds() + "\n" +LocalDateTime.now());
//        LocalDateTime local = LocalDateTime.now();
//        int minus = OffsetTime.now().getOffset().getTotalSeconds();
//        System.out.println(local.minusSeconds(minus));
//        System.out.println(local);
//
//        System.out.println(new AtomicLong(-1) + " " + new AtomicLong(-1).incrementAndGet());

//        System.out.println(2.00 - 1.10);
//        System.out.println(x - y);
//
//
//        String date = "2017-12-31T15:18:51.547453500";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd");
//        LocalDateTime dateTime = LocalDateTime.parse(date);
//        String dateFormatted = dateTime.format(formatter);
//        System.out.println("Date before format " + dateTime);
//        System.out.println("Date after format  " + dateFormatted);


//        GregorianCalendar now = new GregorianCalendar();
//        now.set(2018, 3,15);
//        XMLGregorianCalendar dateTimeNow = DatatypeFactory.newInstance().newXMLGregorianCalendar(now);
//        System.out.println(dateTimeNow);
//
//        System.out.println(now.get(Calendar.YEAR) + " " +
//                now.get(Calendar.MONTH) + " " +
//                now.get(Calendar.DAY_OF_MONTH) + " " +
//                DatatypeConstants.FIELD_UNDEFINED);
//        XMLGregorianCalendar dateNow = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(
//                now.get(Calendar.YEAR),
//                now.get(Calendar.MONTH),
//                now.get(Calendar.DAY_OF_MONTH),
//                DatatypeConstants.FIELD_UNDEFINED);
//        System.out.println(dateNow);

    }
}

