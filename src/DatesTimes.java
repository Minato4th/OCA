import java.time.*;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by aborisco on 2/12/2018.
 */
public class DatesTimes {       //IMMUTABLE

    static LocalDate localDate;
    static LocalTime localTime;
    static LocalDateTime localDateTime;

    public static void main(String[] args) {
        System.out.println(LocalDate.now());        //2018-02-12
        System.out.println(LocalTime.now());        //14:47:57.883
        System.out.println(LocalDateTime.now());    //2018-02-12T14:47:57.883

        localDate = LocalDate.of(2015, Month.FEBRUARY, 21);
        localDate = LocalDate.of(2015, 6, 23);

        localTime = LocalTime.of(6, 15);                               // hour and minute
        localTime = LocalTime.of(6, 15, 30);                    // + seconds
        localTime = LocalTime.of(6, 15, 30, 200);   // + nanoseconds

        localDateTime = LocalDateTime.of(2018, 5, 23, 22,24,20,200);
        localDateTime = LocalDateTime.of(localDate, localTime);

//        LocalDate d = new LocalDate(); // DOES NOT COMPILE
//        LocalDate.of(2015, Month.JANUARY, 32) // throws DateTimeException

        // old fashion
        Date date = new Date();                             //Current date and time
        Calendar calendar = Calendar.getInstance();
        calendar.set(2015, Calendar.DECEMBER, 23);
        date = calendar.getTime();                          //set specific time

        localDateTime = localDateTime.plusDays(12);     //because of immutable
        localDateTime = localDateTime.minusYears(1);
        localDate = localDateTime.toLocalDate().minusDays(3);   //can be easily parsed

        while (localDate.isBefore(LocalDate.of(2014, 9, 23)))
            localDate = localDate.plusDays(1);

        Period period = Period.ofDays(1);
        while (localDate.isBefore(LocalDate.of(2014, 10, 22)))
            localDate = localDate.plus(period);

        Period wrong = Period.ofYears(10).ofDays(15);    //wrong way

        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getYear());
        System.out.println(localDate.getDayOfYear());

        //DateTimeFormatter, simple way
        System.out.println(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(localTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(dateTimeFormatter.format(localDate));
        System.out.println(dateTimeFormatter.format(localDateTime));
//        System.out.println(dateTimeFormatter.format(localTime));      UnsupportedTemporalTypeException

        System.out.println(localDate.format(dateTimeFormatter));        //same as previous
        System.out.println(localDateTime.format(dateTimeFormatter));    //same as previous

        //Creating individual formatting
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:ss");
        System.out.println(localDateTime.format(formatter));

        //Formatting string in LocalDateTime
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM dd yy");
        LocalDate localDate1 = LocalDate.parse("12 10 18", formatter1);
//        LocalDate localDate1 = LocalDate.parse("12 10 2018", formatter1); DateTimeParseException, because 2018
        System.out.println(localDate1);

        //Full cycle for date time parsing
        DateTimeFormatter d1 = DateTimeFormatter.ofPattern("yyyy, MM, dd");
        DateTimeFormatter d2 = DateTimeFormatter.ofPattern("yy/dd/MM");
        LocalDate l1 = LocalDate.parse("2020, 05, 12", d1);
        System.out.println(l1.format(d2));


    }
}
