package src.homeWork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AgeCounter {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Sana kiriting(kk/oo/yyyy):");
        String dateStr = scanner.nextLine();

        Date date = simpleDateFormat.parse(dateStr);

      /*  System.out.println("1. Yoshni bilish");
        System.out.println("2. Kunni bilish");
        */
        System.out.println(getLiveDays(date));
    }

    public static int getAge(Date date){
        Calendar birthDate = Calendar.getInstance();
        birthDate.setTime(date);
        int birthYear = birthDate.get(Calendar.YEAR);
        int birthMonth = birthDate.get(Calendar.MONTH)+1;
        int birthDay = birthDate.get(Calendar.DATE);

        Calendar currentDate = Calendar.getInstance();
        int currentYear = currentDate.get(Calendar.YEAR);
        int currentMonth = currentDate.get(Calendar.MONTH)+1;
        int curDay = currentDate.get(Calendar.DATE);

        if (currentMonth>birthMonth ||(currentMonth==birthMonth&&curDay>=birthDay))
            return  currentYear-birthYear;
        else
            return currentYear-birthYear-1;
    }
    public static int getLiveDays(Date date){
        Calendar birthDate = Calendar.getInstance();
        birthDate.setTime(date);
        int birthYear = birthDate.get(Calendar.YEAR);

        Calendar currentDate = Calendar.getInstance();
        int currentYear = currentDate.get(Calendar.YEAR);

        int result = 0;

        for (int i = birthYear+1; i <= currentYear-1 ; i++) {
            Calendar instance = Calendar.getInstance();
            instance.set(i,1,1);
            int actualMaximum = instance.getActualMaximum(Calendar.DAY_OF_YEAR);
            result+=actualMaximum;
        }

        int birthYearDay = birthDate.getActualMaximum(Calendar.DAY_OF_YEAR) - birthDate.get(Calendar.DAY_OF_YEAR);
        int curYearDay = currentDate.get(Calendar.DAY_OF_YEAR);

        result+=birthYearDay+curYearDay;

        return result;

    }




}
