
abstract class Car {
    abstract public void drive();
}

abstract class Tesla extends Car {
    abstract public void fly();

}

class Porsche extends Tesla {
    public void drive() {
        System.out.println();
        System.out.println("To drive the porsche");
        System.out.println("Start the car engine");
        System.out.println("Enter the drive mode");
        System.out.println("Start the steering");
    }

    public void fly() {
        System.out.println();
        System.out.println("To fly the porsche");
        System.out.println("Start the car engine");
        System.out.println("Enter the fly mode");
        System.out.println("Start the steering");
    }

}

class Mercedes extends Car {
    public void drive() {
        System.out.println();
        System.out.println("To drive the mercedes");
        System.out.println("Start the car engine");
        System.out.println("Enter the drive mode");
    }
}

class NewMercedes extends Mercedes {
    public void drive() {
        System.out.println();
        System.out.println("To drive the new mercedes");
        System.out.println("Start the car engine");
        System.out.println("Enter the drive mode");
    }

}

public class Demo {
    public static void main(String[] args) {
        Tesla car = new Porsche();
        car.drive();
        car.fly();

        Car car1 = new NewMercedes();
        car1.drive();

    }
}