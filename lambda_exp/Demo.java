/*
 * Lambda expression
 * 
 * - Works only with functional interface
 * a functional interface has only one abstract method
 * other tapes of interfaces are
 * -Normal interface, -Interface with multiple abstract methods
 * -Marker interface, has no single abstract method
 * 
 * a functional interface is also knwown as a SAM(Single Abstract Method)
 * 
 */
@FunctionalInterface
interface A {
    int add(int a, int b);
}

/*
 * We use the annotation @FunctionalInterface to make sure that the interface is
 * a functional interface
 */

public class Demo {
    public static void main(String[] args) {
        A obj = (a, b) -> a + b;
        System.out.println(obj.add(10, 10));

    }

}