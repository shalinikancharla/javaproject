import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date {
    public static void main(String[] args) throws ParseException {
        Date date =new Date();
        System.out.println(date);  //Sat May 28 16:34:49 IST 2022 without giving input we get output

        //FDS=using format method convert date to string
        SimpleDateFormat sd=new SimpleDateFormat("dd-MM-yyyy");
        // String str=sd.format(date);
        //System.out.println(str);
        System.out.println(sd.format(date));//28-05-2022

        //PSD=using parse method convert string to date

        String datestr="29/05/2022";
        SimpleDateFormat sd1=new SimpleDateFormat("dd/MM/yyyy");
       System.out.println(sd1.parse(datestr));
        //Date dateparse=sd1.parse(datestr);//
       // System.out.println(dateparse);

        //convert year as centuary
        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy");

        String currentYear = sd2.format(date);

        System.out.println("CurrentYear="+currentYear);

        String century = currentYear.substring(0,2);
        System.out.println(century);//20
        System.out.println(Integer.parseInt(century)+1);//21
        //System.out.println("century="+(Integer.parseInt(century)+1));


    }
}
