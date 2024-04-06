package src.timeAPI;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeExample {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(localDateTime);
        System.out.println(localDateTime.plus(124, ChronoUnit.YEARS));

        int hour = localDateTime.getHour();
        Month month = localDateTime.getMonth();
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        System.out.println(dayOfWeek);

    }
}
