public class AdvCalc extends Calc {
    public int multi(int a, int b) {
        return a * b;

    }

    /*
     * the add method is overloaded because it has 3 parameters diffrent from two
     * parameters of add from the pareent class
     */
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    /*
     * this is method overriding because the behavior of the method is diffrent
     */

    public int sub(int a, int b) {
        return (a - b) + 1;
    }

    public int div(int a, int b) {
        return a / b;
    }

}
