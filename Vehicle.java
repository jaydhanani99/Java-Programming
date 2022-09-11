import java.lang.ProcessHandle.Info;

public class Vehicle implements Information {
    public void design() {
        System.out.println("Vehicle Design");
    }

    private String type;

    public Vehicle(String type) {
        this.type = type;
    }

    public void drive() {
        System.out.println("Driving the vehicle");
    }

    // So Information interface convey that Computer class must have all the methods
    public void displayInformation() {
        System.out.println("Vehicle type is: " + type);
    }
}
