enum Status {
    Pending, Approved, Failed, Success
}

enum Laptop {
    Macbook(5000, "Apple"), ThinkPad(1000, "Lenovo"), Notebook(1400, "HP"), XPS(2000, "IBM"), Latitude;

    private int price;
    private String brand;

    private Laptop() {
        brand = "Dell";
        price = 1000;

    }

    private Laptop(int price, String brand) {
        this.brand = brand;
        this.price = price;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}

public class Demo {
    public static void main(String[] args) {

        // Status[] s = Status.values();
        // for (Status status : s) {
        // System.out.println(status);
        // }
        // Status val = Status.Success;
        // switch (val) {
        // case Pending:
        // System.out.println("100");
        // break;
        // case Approved:
        // System.out.println("210");
        // break;
        // case Failed:
        // System.out.println("400");
        // break;

        // default:
        // System.out.println("200");
        // break;
        // }

        for (Laptop laptop : Laptop.values()) {
            System.out.println(laptop + ":" + laptop.getPrice() + ":" + laptop.getBrand());
        }

    }
}