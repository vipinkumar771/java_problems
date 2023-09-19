 class Thirty1 {
    public void display(String s){
        System.out.println("String");
    }
    public void display(StringBuilder s){
        System.out.println("String Builder");
    }
}
public class ThirtyOne{
    public static void main(String[] args) {
        Thirty1 t = new Thirty1();
        t.display("null");
    }
}
