import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 8);
        // Stream<Integer> stream = nums.stream();
        Stream<Integer> result = nums.stream().filter(n -> n % 2 == 0).map(n -> n * 2);
        result.forEach(n -> System.out.println(n));
    }

}
