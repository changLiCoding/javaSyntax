package ReferenceTypeInJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateType {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

        Date now = new Date();
        System.out.println(now);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateFormatStr = sdf.format(now);
        System.out.println(dateFormatStr);

        String dateString = "2022--06-01";
//        Date parseDate = sdf.parse(dateString);
//        Date parsedDate = sdf.parse(dateString);
        now.setTime(System.currentTimeMillis());
//        now.setTime();


    }
}
