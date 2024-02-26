public class Demo {

    public static void main(String[] args) {
        VeryAdvCalc calc = new VeryAdvCalc();
        int add = calc.add(10, 20);
        int sub = calc.sub(20, 10);
        int mult = calc.multi(10, 20);
        int div = calc.div(20, 10);
        double power = calc.power(10, 2);
        System.out.println(add + " " + sub + " " + mult + " " + div + " " + power);
    }
}
