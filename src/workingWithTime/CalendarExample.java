package src.workingWithTime;

import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        calendar.add(Calendar.DATE,10);
        calendar.add(Calendar.HOUR,1);
        Date time = calendar.getTime();
        System.out.println(time);
        System.out.println(calendar.getFirstDayOfWeek());
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    }
}
