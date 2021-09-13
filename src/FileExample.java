import java.io.IOException;
import java.nio.file.Paths;

public class FileExample {
    public static void main(String[] args) throws IOException{
        var filename = "students.txt";
        var studentFile = Paths.get(filename);
    }
}
