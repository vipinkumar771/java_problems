import java.io.IOException;
class MyResource1 implements AutoCloseable{
    public void close() throws Exception{
        System.out.println("1");
    }
}
class MyResource2 implements AutoCloseable{
    public void close() throws IOException{
        throw new IOException();
    }
}


public class Thirty {
    public static void main(String[] args) {
        try(MyResource1 r1 = new MyResource1();
            MyResource2 r2 = new MyResource2();){
            System.out.println("T");
        }catch (Exception ioe){
            System.out.println("IOE");
        }finally {
            System.out.print("F");
        }
    }
}

//a) T IOE F
//b) T 1 IOE F
//C) T IOE 1 F
//D) Compilation fails