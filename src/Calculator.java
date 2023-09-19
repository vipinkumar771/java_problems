
public class Calculator {
    int num = 100;
    public void calc(int num)  {
        this.num = num * 10;
    }
    public void printNum()     {
        System.out.println(num);  // 20
    }

    public static void main(String[] args)
    {
        Calculator obj = new Calculator();
        obj.calc(2);
        obj.printNum();
    }
}
