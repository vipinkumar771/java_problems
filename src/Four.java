import java.io.FileNotFoundException;

     class Four {
        public void printName() throws FileNotFoundException{
            System.out.println("Value-A");
        }
    }
     class L extends Four {
        public void printName()throws NullPointerException{
            System.out.println("Name-B"); // Name-B
        }
    }
     class Tes {
        public static void main(String[] args) throws Exception {
            Four a = new L();
            a.printName();
        }

}