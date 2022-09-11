import java.util.Scanner;
public class _6UserInput {
    public static void main(String[] args) {
        // System.in is standard input stream object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text");
        String text = input.nextLine();
        System.out.println(text);

        // To get input as integer
        // int x = input.nextInt();
    }
}
