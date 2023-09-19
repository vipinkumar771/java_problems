import java.sql.SQLOutput;

public class Three {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Java");
        String s2 = s1.toString();
        String s3 = s1.toString();
        StringBuilder s4 = s1;
        System.out.println((s2 == s3) + " " + (s1 == s4)); // false true
    }
}
