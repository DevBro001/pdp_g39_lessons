package src.timeAPI;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now(ZoneId.of("America/New_York"));
        System.out.println(localTime);
        LocalTime plus = localTime.plus(12, ChronoUnit.HOURS);
        System.out.println(plus);
    }
}
