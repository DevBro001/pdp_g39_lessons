package src.timeAPI;

import java.time.Instant;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;
import java.util.Date;

public class ExamplesInstant {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant.get(ChronoField.MILLI_OF_SECOND));
        System.out.println(instant.get(ChronoField.MICRO_OF_SECOND));
        System.out.println(instant.get(ChronoField.NANO_OF_SECOND));
        System.out.println(instant);

        Date date = new Date();
        Instant instant1 = date.toInstant();

    }
}
