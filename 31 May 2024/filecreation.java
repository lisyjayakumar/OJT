import java.io.File;
import java.io.IOException;

public class filecreation {
    public static void main(String[] args) throws IOException {
        // Create a File object
        File file = new File("example.txt");

        // Create the file
        file.createNewFile();

        // Print message if file creation is successful
        System.out.println("File created successfully!");
    }
}
