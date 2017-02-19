package D;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by VKurochkin on 9/28/2016.
 */
public class Dates {

    public static void main(String[] args) {
        System.out.println(currentDate());
        System.out.println("The final date without weekends: " + addToCurrentDateNoWeekends(3));
        System.out.println("Adding 3 days after my date of birth: " + addToProvidedDate("3","29","1987",3));
    }

    public static String currentDate(){
        SimpleDateFormat setDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date()); // Now use today date.
        String currentDate = setDateFormat.format(calendar.getTime());

        return currentDate;
    }

    public static String addToCurrentDateNoWeekends(int addDays){
        String requestedDate; // output
        String finalDate; // output2
        SimpleDateFormat setDateFormat;  // sdf

        setDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date()); // Now use today date.
        c.add(Calendar.DATE, addDays); // Adding some days
        requestedDate = setDateFormat.format(c.getTime());
        System.out.println("The date after adding 3 days(including weekends): " + requestedDate);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        if(dayOfWeek == 7 ){
            c.add(Calendar.DATE, 2);
        } else if(dayOfWeek == 1) {
            c.add(Calendar.DATE, 1);
        }else{
            // DO NOTHING
        }
        finalDate = setDateFormat.format(c.getTime());
        return finalDate;
    }

    public static String addToProvidedDate(String month, String day, String year, int addDays){
        String finalDate; // output2
        SimpleDateFormat setDateFormat;  // sdf

        setDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Calendar c = Calendar.getInstance();
        c.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));
        c.add(Calendar.DATE, addDays); // Adding some days
        finalDate = setDateFormat.format(c.getTime());
        return finalDate;
    }
}
