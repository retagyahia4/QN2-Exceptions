import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Question Two - Part (d)
 * Original snippet leaked the file handle if an exception was thrown
 * before br.close() ran. This version uses try-with-resources so the
 * BufferedReader is ALWAYS closed automatically, even if readLine() throws.
 */
public class ResourceDemo {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // br.close() is called automatically here, no matter what happened above
    }
}
