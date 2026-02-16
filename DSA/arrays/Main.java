package arrays;

import arrays.Array;

public class Main {

  public static void main(String[] args) {
    // System.out.println("Hello");
    Array numbers = new Array(3);
    numbers.insert(10);
    numbers.insert(20);
    numbers.insert(30);
    numbers.insert(40);

    // numbers.print();

    numbers.removeAt(1);
    numbers.print();

  }

}
