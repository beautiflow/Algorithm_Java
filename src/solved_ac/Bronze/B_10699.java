package solved_ac.Bronze;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class B_10699 {
    public static void main(String[] args) {

        Date d = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        df.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
        System.out.println(df.format(d));
    }
}
