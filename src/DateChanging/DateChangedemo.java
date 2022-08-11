package DateChanging;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.util.Calendar.PM;

public class DateChangedemo {

    private long getMillis(String givenTime) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm aa");

            Date mDate = sdf.parse(givenTime);
            long timeInMilliseconds = mDate.getTime();
            System.out.println("Date in milli :: " + timeInMilliseconds);
            return timeInMilliseconds;

    }

    public static void main(String[] args) throws ParseException {
        DateChangedemo date=new DateChangedemo();
        date.getMillis("06:19 PM");
        }

}
