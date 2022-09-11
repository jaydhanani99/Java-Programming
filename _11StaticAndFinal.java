class Student{
    public String name;
    public static String studentClass;
}

public class _11StaticAndFinal {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Steven";
        s2.name = "Daniel";

        Student.studentClass = "Test";

        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(Student.studentClass);
    }
}
