import java.lang.ProcessHandle.Info;

public class Computer implements Information {
    private int serialNumber = 8035;

    public void start() {
        System.out.println("Computer started!");
    }

    // So Information interface convey that Computer class must have all the methods
    public void displayInformation() {
        System.out.println("Computer serial number is: " + serialNumber);
    }
}
