import java.util.Calendar;
public class Calender{
    public static void main(String [] args){
        Calendar calendar=Calendar.getInstance();

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONDAY));
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));

        calendar.set(Calendar.YEAR,2012);
        System.out.println(calendar);
        System.out.println(calendar.getTimeInMillis());
    }
}