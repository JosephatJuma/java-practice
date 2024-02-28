
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

abstract class C {
    abstract public void show();

    abstract public void config();
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

        // anonymous inner class
        A obj2 = new A() {
            public void show() {
                System.out.println("In Anonymous A Show ");
            }
        };
        obj2.show();

        A.B obj3 = new A().new B() {
            public void show() {
                System.out.println("In Anonymous B Show ");
            }
        };
        obj3.show();

        C obj4 = new C() {
            public void show() {
                System.out.println("In Anonymous C Show ");
            }

            public void config() {
                System.out.println("In Anonymous C Config ");
            }
        };
        obj4.show();
    }
}