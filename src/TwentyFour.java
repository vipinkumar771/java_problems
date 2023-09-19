import java.io.IOException;

class Derived {
    public void getDetails()throws IOException // line 23
    {
        System.out.println("Derived class");
    }
}
public class TwentyFour extends Derived{
    public void getDetails()  // throws Exception // line 24 ans
    {
        System.out.println("TwentyFour class");
    }
    public static void main(String[] args) throws IOException // line 25
    {
        Derived obj = new TwentyFour();
        obj.getDetails();
    }

}
