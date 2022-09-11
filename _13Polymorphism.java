public class _13Polymorphism {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Truck t1 = new Truck();

        Vehicle v2 = t1;

        // This is pointing to truck object, so it would call design method of truck class
        // So v1 has ability to take different form (truck in our case)
        v1.design();

        t1.ride();
        // This would throw an error
        // v2.ride();
    }
}
