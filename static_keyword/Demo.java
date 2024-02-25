
class Mobile {
    String brand;
    int price;
    static String name;

    public Mobile() {
        System.out.println("constructor");
    }

    static {
        name = "Smart Phone";
        System.out.println("static block");
    }

    /*
     * the static block is executed only once and first
     * 
     * each object of the class is has the same value of the static instance
     * 
     * 
     * variable
     */

    public void display() {
        System.out.println(brand + " " + price + " " + name);
    }
}

public class Demo {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        // Mobile.name = "Smart Phone";
        m1.brand = "Iphone";
        m2.brand = "Samsung";
        m1.price = 1000;
        m2.price = 2000;
        m1.display();
        m2.display();

    }

}
