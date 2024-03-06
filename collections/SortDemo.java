import java.util.*;

public class SortDemo {
    public static void main(String[] a) {

        List<Integer> nums = new ArrayList<>();
        nums.add(17);
        nums.add(12);
        nums.add(100);
        nums.add(75);

        /*
         * The Collections.sort() method sorts the specified list in ascending order.
         */
        Collections.sort(nums);
        System.out.println(nums);
        /*
         * To sort in descending order, use Collections.sort(nums,
         * Collections.reverseOrder())
         */
        Collections.sort(nums, Collections.reverseOrder());
        System.out.println(nums);

        /*
         * We can also sort using a Comparator to specify a custom sort order(*our own
         * logic)
         */

        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer num1, Integer num2) {
                /* Check the last digit */
                if (num1 % 10 > num2 % 10)
                    return 1;
                else
                    return -1;

            }
        };

        Collections.sort(nums, comp);
        System.out.println(nums);

    }
}