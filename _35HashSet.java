import java.io.StreamCorruptedException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class Student {
    private int rollNo;
    private String name;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    // To return object as string
    public String toString() {
        return this.name;
    }

    @Override
    // To determine two objects are equal or not
    public boolean equals(Object obj) {
        // if two object are identical return true
        if (this == obj) return true;
        // If new object is null or class of both object is different return false
        if (obj == null || getClass() != obj.getClass()) return false;

        // Typecast obj to Student class into student variable
        Student student = (Student) obj;

        return this.rollNo == student.rollNo;
    }
}

public class _35HashSet {
    public static void main(String[] args) {
        // Only contain unique values
        HashSet<String> h1 = new HashSet<String>();

        // Only contain unique values in the order you have added
        LinkedHashSet<String> h2 = new LinkedHashSet<String>();

        // Only contain unique values in the sorted order
        TreeSet<String> h3 = new TreeSet<String>();

        h1.add("red");
        h1.add("blue");
        h1.add("yellow");
        h1.add("black");
        h1.add("grey");
        h1.add("green");

        // Check for exists or not
        h1.contains("red");
        // Check for empty
        h1.isEmpty();
        // To remove item
        h1.remove("red");
        // Remove items from h2 that are contained in h1
        h2.removeAll(h1);

        h2.add("red");
        h2.add("blue");
        h2.add("yellow");
        h2.add("black");
        h2.add("grey");
        h2.add("green");

        h3.add("red");
        h3.add("blue");
        h3.add("yellow");
        h3.add("black");
        h3.add("grey");
        h3.add("green");

        System.out.println("-----------h1------------");
        System.out.println(h1);
        System.out.println("-----------h2------------");
        System.out.println(h2);
        System.out.println("-----------h3------------");
        System.out.println(h3);

        // Hashset for custom object, functions equals and hashCode in Student class,
        //  identifies whether two objects are equals or not and based on that,
        //  hashSet determine the uniqueness
        HashSet<Student> s = new HashSet<Student>();
        s.add(new Student("a", 1));
        s.add(new Student("b", 2));
    }
}
