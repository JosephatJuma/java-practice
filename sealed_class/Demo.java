
sealed interface X permits A, Y {
    public void show();
}

non-sealed interface Y extends X {

}

sealed class A implements X permits B, C {

    public void show() {
        System.out.println("In A show");
    }

}
/*
 * Specify the class that extends the sealed class usimng the permits keyword
 * the child classes must be A should be declared either final, sealed, or
 * non-sealed
 */

final class B extends A {
    public void show() {
        System.out.println("In B show");
    }

}

sealed class C extends A permits D {
    public void show() {
        System.out.println("In C show");
    }

}

non-sealed class D extends C {
    public void show() {
        System.out.println("In D show");
    }

}

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
}