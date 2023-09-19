import java.util.*;

public class Antique {
    public static void main(String[] args) {
        List<String>myList = new ArrayList<String>();
        assert(args.length>0);
        System.out.println("Still static");
    }
}

// Which set of command( javac followed by java) will compile and run without exception or error? (Choose all that apply).
// select one or more
// a) javac -source 6 Antique.java
//    java Antique

// b) javac - source 1.4 Antique.java
// java Antique

// c) javac -source 1.4 Antique.java
// java-ea Antique

// d) javac Antique.java
// java -ea Antique

// ac are correct ans