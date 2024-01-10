import java.util.*;
import java.time.*;

class datetime {
    public static void main(String[] args) {
        // datetime d = new datetime();
        Calendar cal = Calendar.getInstance();
        Date d = new Date();
        LocalTime t = new LocalTime();
        
        // System.out.println(cal.get(Calendar.DATE)+" "+cal.get(Calendar.MONTH)+" "+cal.get(Calendar.YEAR));
        System.out.println(LocalTime.now());
    }
}
