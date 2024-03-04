import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(10);
        nums.add(100);
        nums.add(70);
        for (int n : nums) {
            System.out.println(n);

        }
    }
}