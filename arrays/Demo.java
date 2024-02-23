
class Student {
    String name;
    int age;
    int marks;
}

public class Demo {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.name = "Ram";
        s2.name = "Shyam";
        s3.name = "Hari";

        s1.age = 10;
        s2.age = 20;
        s3.age = 30;

        s1.marks = 100;
        s2.marks = 200;
        s3.marks = 300;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        for (Student student : students) {
            System.out.println(student.name + " " + student.age + " " + student.marks);
        }
    }

}
