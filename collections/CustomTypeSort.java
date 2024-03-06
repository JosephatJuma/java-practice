import java.util.*;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int compareTo(Student obj) {
        return this.age > obj.age ? 1 : -1;
    }

}

public class CustomTypeSort {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student(20, "Marvin"));
        students.add(new Student(19, "Jacquelin"));
        students.add(new Student(22, "Charles"));
        students.add(new Student(21, "Bob"));

        // sort by name
        Comparator<Student> comp = (s1, s2) -> s1.name.length() < s2.name.length() ? 1 : -1;

        // using comaprable
        Collections.sort(students);
        for (Student s : students)
            System.out.println(s.name + " : " + s.age);
        System.out.println();

        // using comparator
        Collections.sort(students, comp);
        for (Student s : students)
            System.out.println(s.name + " : " + s.age);

    }

}
