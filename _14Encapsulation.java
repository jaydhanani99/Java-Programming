class Car {
    private String type;

    // So we are hiding the implementation of type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

public class _14Encapsulation {
    public static void main(String[] args) {
        Car c1 = new Car();

        // This would throw error as private variable cannot be accessed directly
        // c1.type = "BMW";

        c1.setType("BMW");

        System.out.println(c1.getType());
    }
}