import java.util.*;
import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 7, 20, 9, 15, 8);
        // using the enhanced for loop

        // for (int num : nums) {
        // System.out.println(num);
        // }

        Consumer<Integer> consumer = new Consumer<Integer>() {
            public void accept(Integer num) {
                System.out.println(num);
            }

        };

        nums.forEach(consumer);

        // iunstead of using the enhanced for loop, we can use the forEach method
        /*
         * forEach is a method in the List interface that takes a Consumer as an
         * argument.
         */

        // the Consumer is a functiional interface, thus we can use lambda expression
        // instead of creating an anonymous class

        // Consumer<Integer> con = n -> System.out.println(n);
        // nums.forEach(con);

        // we can bring the consumer as an argument to the forEach method
        nums.forEach(n -> System.out.println(n));

    }
}