class Methods {
    // Return none
    void run() {
        System.out.println("Hello");
    }

    // Return integer
    int calc() {
        return 50;
    }

    // Return array
    int[] arr() {
        int[] a = new int[5];
        return a;
    }
}

public class _9Class {
    public static void main(String[] args) {
        Methods m = new Methods();
        m.run();

        System.out.println(m.calc());
    }
}
