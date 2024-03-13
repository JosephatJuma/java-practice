public class Demo {
    public static void main(String[] args) {
        int nums[] = { 5, 7, 9, 11, 13 };
        int target = 13;
        int result = linearSearch(nums, target);
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);

        // binary search
        result = binarySearch(nums, target);
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);

    }

    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return -1;
    }
}