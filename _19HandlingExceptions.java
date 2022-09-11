import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _19HandlingExceptions {
    // public static void main(String[] args) throws FileNotFoundException {
    //     File file = new File("example.txt");
        
    //     Scanner readFile = new Scanner(file);

    //     readFile.close();
    // }

    // Or we can use try catch

    public static void main(String[] args) {
        File file = new File("example.txt");
        
        
        try {
            Scanner readFile = new Scanner(file);
            readFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
