import java.sql.SQLOutput;

public class StringBuff {
    public static void main(String[] args) {
        String s3 = "a";
        StringBuffer s1 = new StringBuffer("a");
        StringBuffer s2 = new StringBuffer("a");
        StringBuilder s4 = new StringBuilder("a");
        s1.hashCode();
        s2.hashCode();
        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equals(s3)); // false
        System.out.println(s1.equals(s4)); // false
        System.out.println(s1.equals(s4)); // false
    }
}
