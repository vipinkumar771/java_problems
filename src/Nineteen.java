public class Nineteen {
    int num1 = 3;
    int num2 = 5;
    Nineteen(){

    }
    Nineteen(int num1, int num2){
        if(num2<30){
            this.num2= num2;
        }
        num1 = num1;
    }
    public static void main(String[] args) {
        Nineteen s3 = new Nineteen();

        Nineteen s1 = new Nineteen(9,10);
        Nineteen s2 = new Nineteen(12,22);
        System.out.println(s1.num1 + " " + s1.num2 + " " + s2.num1 + " " + s2.num2); // 3, 10, 3,22
        System.out.println(s3.num1);
        System.out.println(s3.num2);
    }
}
