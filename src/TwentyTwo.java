//interface Sample{
//    String change(int d);
//}
//public class TwentyTwo implements Sample {
//    public String change(int s){
//     return "Hello";
//    }
//}

interface Sample {
    String change(int d);
}

public class TwentyTwo {
    public static void main(String[] args) {
        Sample lambda = (s) -> "Hello";
        System.out.println(lambda.change(5));
    }
}