import java.util.Scanner;
class _42ScannerClass {
    public static void main(String args[]) {
        // We can change the default delimiter of scanner class (default is space separated keyboard input)
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("##");

        
        sc.close();
    }
}