package ReferenceTypeInJava;

import java.util.Calendar;
import java.util.Date;

public class CalanderType {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
//
//        System.out.println(instance);
//        System.out.println(instance.get(Calendar.YEAR));
//        System.out.println(instance.get(Calendar.MONTH));
//        System.out.println(instance.get(Calendar.DATE));
//        System.out.println(instance.get(Calendar.DAY_OF_YEAR));

        instance.setTime(new Date());
//        instance.add(Calendar.YEAR, 23);
//        System.out.println(instance.get(Calendar.YEAR));
//
//        instance.add(Calendar.DATE, 24);
//        System.out.println(instance.get(Calendar.MONTH));

        for( int i = 0; i < 365; i++) {
            instance.add(Calendar.DATE, 1);
            System.out.println(instance.getTime());
        }


    }
}
