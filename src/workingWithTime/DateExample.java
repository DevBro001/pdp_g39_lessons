package src.workingWithTime;

import java.util.Date;

public class DateExample {

    public static void main(String[] args) {
//        Date date = new Date();
        Date now = new Date();
        Date afterTenMinute = new Date(System.currentTimeMillis()+10*60*1000);

        System.out.println(now);
        System.out.println(afterTenMinute);

        boolean after = now.after(afterTenMinute);
        boolean before = now.before(afterTenMinute);
        System.out.println(after);
        System.out.println(before);

    }
}
