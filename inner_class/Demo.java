
class A {
    int a = 10;

    public void show() {
        System.out.println("In A show");

    }

    class B {
        public void show() {
            System.out.println("In B show");
        }
    }

}

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        A.B obj1 = obj.new B();
        obj.show();
        obj1.show();

        /*
         * To access the inner class we need to create an object of the outer class
         */
    }
}