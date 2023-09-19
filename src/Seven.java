public class Seven {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("a");
        StringBuffer s2 = new StringBuffer("a");
        s1.hashCode();
        s2.hashCode();
        System.out.println(s1.equals(s2)); // false
    }
}
