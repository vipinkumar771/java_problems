public class Six {
    public static void main(String[] args) {
        String chars[] = {"a", "b", "c", "a", "c"};
        for (int i = 0; i < chars.length; ++i)
            for (int j = i+1; j < chars.length; ++j)
                if (chars[i].compareTo(chars[j]) == 0)
                    System.out.print(chars[j]);
        }
}
// ans ac