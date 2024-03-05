import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(10);
        nums.add(100);
        nums.add(70);
        for (int n : nums) {
            System.out.println(n);

        }
        // while (nums.size() > 0) {
        // System.out.println(nums.get(0));
        // nums.remove(0);
        // }

    }
}