package src.timeAPI;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate localDate = LocalDate.of(2000, 2, 29);
        System.out.println(localDate);

        System.out.println(localDate.lengthOfMonth());
        System.out.println(localDate.lengthOfYear());


        System.out.println(now.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(now.get(ChronoField.HOUR_OF_DAY));

    }
}
