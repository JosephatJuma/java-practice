
class Human {
    private String name = "Josephat";
    private int age = 20;

    // access data from outside the class through methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Demo {

    public static void main(String[] args) {
        Human human1 = new Human();
        System.out.println(human1.getName() + ":" + human1.getAge());

    }

}