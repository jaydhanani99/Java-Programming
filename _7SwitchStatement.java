import java.util.Scanner;

public class _7SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch(x) {
            case 1:
                System.out.println("This is: 1");
            break;
            case 2:
                System.out.println("This is: 2");
            break;
            case 3:
                System.out.println("This is: 3");
            break;
            default:
                System.out.println("None");
        }
        sc.close();
    }
}
