import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFile {


    public static void main(String[] args) throws IOException {
        PrintWriter outToFile = new PrintWriter(new FileWriter("output.txt"));
        outToFile.println("A little text");
        outToFile.close();
    }
}
