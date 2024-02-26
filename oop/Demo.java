class Calculator {
    public int add(int a, int b) {
        System.out.println("Inside add method");
        return a + b;
    }
}

class Demo {
    public static void main(String[] a) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 20));
    }

}
