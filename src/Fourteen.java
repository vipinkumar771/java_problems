import java.sql.SQLOutput;
import java.util.ArrayList;

public class Fourteen{
    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        obj.add("A");
//        obj.add("B");
//        obj.add("C");
//        obj.add(1, "D");
//        System.out.println(obj);

        obj.ensureCapacity(3);
        System.out.println(obj.size());
    }
} // ans 1