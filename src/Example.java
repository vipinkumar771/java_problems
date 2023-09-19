 class Example {
    public static void main(String args[]) {
        String test = "abc";
        test = test + test;
        System.out.println(test); // abcabc

        String s1 = new String("a");
        String s2 = new String("A");
        String s3 = new String ("a");
        System.out.println(s1.hashCode() == s3.hashCode()); // true
        System.out.println(s2.hashCode()== s3.hashCode()); // false

//          String s1 = new String("a");
//          String s2 = new String("b");
//          String s3 = new String("c");
//          String s4 = "d";
//          String s5 = "a";
//          String s6 = "c";
    }
}