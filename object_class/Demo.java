class Laptop {
    String model;
    int price;

    public void display() {
        System.out.println(model + " : " + price);
    }

    public String toString() {
        return model + " : " + price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

}

public class Demo {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "HP Notebook";
        obj.price = 10000;
        obj.display();

        Laptop obj2 = new Laptop();
        obj2.model = "Dell Latitude 15";
        obj2.price = 10000;

        System.out.println(obj.equals(obj2));

    }

}
