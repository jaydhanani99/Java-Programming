import java.lang.reflect.Constructor;

class Program {
    public Program(String test) {
        System.out.println(test);
    }
}

public class _10Constructors {
    public static void main(String[] args) {
        Program p = new Program("Hello");
    }
}
