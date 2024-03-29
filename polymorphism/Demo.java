
class A {
    public void show() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B show");
    }
}

class C extends A {
    public void show() {
        System.out.println("in C show");
    }
}

class D extends B {
    public void show() {
        System.out.println("in D show");
    }
}

public class Demo {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

        obj = new D();
        obj.show();

        // Dynamic method dispatch

        // the above is run time polymorphism

        // it doesnt matter the type of the object at runtime

    }
}
