import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Ten {
    public void readFile(String fName) throws IOException {
        //Line n1
        Path p = Paths.get(fName);
        Stream<String> content = Files.lines(p);
        content.forEach(s1 -> System.out.println(s1));
    }
    public static void main(String[] args) throws IOException{
        Ten trf = new Ten();
        trf.readFile("TestResult.txt");
    }
}
