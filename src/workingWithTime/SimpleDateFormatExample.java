package src.workingWithTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
//        System.out.println(date); // 02/02/2024
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");
        //String format = simpleDateFormat.format(date);

        Date parse = simpleDateFormat.parse("01/03/2024");

        System.out.println(parse);
    }
}
