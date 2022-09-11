import java.util.Scanner;

public class _3WhileLoop {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0) {
            System.out.println(i);
            i--;
        }

        int number;
        // Do while loop
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter a number");
            number = input.nextInt();
        }while (number != 9);
    }
}
