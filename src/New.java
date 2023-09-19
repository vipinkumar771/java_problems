public class New {
    public static void main(String[] args) {
        String s1 = new String("a");
        String s2 = new String("A");
        String s3 = new String("a");
        System.out.println(s1.hashCode() == s3.hashCode()); //true
        System.out.println(s1.hashCode() == s2.hashCode()); // false
    }
}
