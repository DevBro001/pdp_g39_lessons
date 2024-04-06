package src.timeAPI;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DurationAndPeriodExample {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate birthDate = LocalDate.of(2006,07,28);
//        LocalDate plus = LocalDate.now().plus(1,ChronoUnit.YEARS).plus(2,ChronoUnit.MONTHS).plus(3,ChronoUnit.DAYS);

        Period between = Period.between(birthDate, now);

        System.out.println(between.toTotalMonths());



        /* LocalTime now = LocalTime.now();
        LocalTime minus = LocalTime.now().minus(2, ChronoUnit.HOURS).minus(30,ChronoUnit.MINUTES);
        Duration between = Duration.between( minus,now);

        System.out.println(between.toMinutes());*/
    }
}
