import java.text.SimpleDateFormat;

public class Date {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd'T'hh:MM:ss");
        String nowStr = sdf.format(now);
        System.out.println("Current Date: " + nowStr );
    }
}
