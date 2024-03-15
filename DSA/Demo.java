public class Demo {
    public static void main(String[] args) {
        int nums[] = new int[100];
        int index = 0;
        for (int i = 1; i < nums.length * 2; i += 2) {
            nums[index] = i;
            System.out.print(i + ", ");
            index++;
        }

        System.out.println();

        int target = 99;
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

    // public static int linearSearch(int nums[], int target) {
    // int steps = 0;
    // for (int i = 0; i < nums.length; i++) {
    // steps = i + 1;
    // System.out.println("Step taken for linear: " + steps);
    // if (nums[i] == target)
    // return i;

    // }
    // return -1;
    // }

    public static int linearSearch(int nums[], int target) {
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            steps = i + 1;
            System.out.println("Step taken for linear: " + steps);
            if (target == nums[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int nums[], int target) {
        int left = 0;
        int right = nums.length - 1;
        int steps = 0;
        while (left <= right) {
            steps = steps + 1;
            System.out.println("Steps Taken for binary: " + steps);
            int mid = (left + right) / 2;
            // System.out.println(mid + " = " + nums[mid]);
            if (target == nums[mid])
                return mid;
            else if (target > nums[mid])
                left = mid + 1;
            else
                right = mid - 1;

        }

        return -1;
    }

    // public static int binarySearch(int nums[], int target) {
    // int left = 0;
    // int right = nums.length - 1; // index starts at 0, so we deduct 1
    // int steps = 0;

    // while (left <= right) {
    // steps = steps + 1;
    // System.out.println("Step: " + steps);
    // int mid = (left + right) / 2;
    // // System.out.println(mid);
    // // if the target is at index mid
    // if (nums[mid] == target) {
    // return mid;
    // }
    // // target is not at index mid, check if the target is less than the value at
    // // index mid , increase mid by one if the target is greater than element at
    // // index mid,
    // // norrow the search so that we focus on values which are greater, the
    // iterate
    // // again
    // else if (nums[mid] < target) {
    // left = mid + 1;

    // } else {
    // right = mid - 1;
    // // means that the target is less than the cureent value at mid, and so we
    // focus
    // // on lower values
    // }

    // }
    // return -1;// the elecment is not in the array
    // }

}