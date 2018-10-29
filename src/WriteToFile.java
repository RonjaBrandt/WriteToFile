import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFile {


    public static void main(String[] args) throws IOException {
        PrintWriter outToFile = new PrintWriter(new FileWriter("output.txt"));
        outToFile.println("A little text");
        outToFile.close();
        // %= skriv ut
        // 6=skriv ut sex tecken långt/
        // &6.3d = skriv ut 6 positioner före decimal sen 3 postioner i decimal
        // %6s = skriv ut 6 postioner av String
        int i = 2;
        double d = i/3.0;
        String s = "Hello";
        outToFile.printf("Result:%n i = %6d %n d= = %6.3d %n %6s %n", i,d,s);
    }
}
