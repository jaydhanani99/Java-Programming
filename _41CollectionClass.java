import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.lang.Comparable;

class Student implements Comparable<Student> {
    private int rollNo;
    public String name;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public int compareTo(Student o) {
        // if positive it sort in ascending order else descending order
        return this.rollNo - o.rollNo;
    }
}

public class _41CollectionClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(34);
        list.add(35);
        list.add(36);
        list.add(37);
        list.add(38);

        // ------------------------- Collections class ------------------------------
        // Returns minimum element from list
        Collections.min(list);

        // Returns maximum element
        Collections.max(list);

        // Returns frequency of element
        Collections.frequency(list, 34);

        // To sort collection
        Collections.sort(list);

        // To sort in descending order
        Collections.sort(list, Comparator.reverseOrder());


        // Custom sort
        List<Student> l = new ArrayList<Student>();
        l.add(new Student("a", 1));
        l.add(new Student("b", 2));

        // For custom sort we need to implement Comparable interface on Student class
        Collections.sort(l);

        // We can also define Comparator here only (not in Student class)
        Collections.sort(l, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }  
        });

        // We can also define using lambda function
        Collections.sort(l, (o1, o2) -> o1.name.compareTo(o2.name));
    }
}
