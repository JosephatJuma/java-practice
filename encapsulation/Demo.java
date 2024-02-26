
class Human {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // access data from outside the class through methods

}

public class Demo {

    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge(100);
        human1.setName("Josephat");
        System.out.println(human1.getName() + ":" + human1.getAge());
    }

}