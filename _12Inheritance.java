public class _12Inheritance {
    public static void main(String[] args) {

        // access modifiers: public, protected, private, default (lack of access modifier)

        Factory f1 = new Factory();
        f1.design();
        f1.build();  
        
        Car c1 = new Car();

        c1.design();
        c1.build();
        c1.brand();
    }
}
