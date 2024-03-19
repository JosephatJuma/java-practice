class DSA {
    public void sort(int arr[]) {
        int temp = 0;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
        }
        System.out.println("Sorted Array: ");
        for (int element : arr) {
            System.out.print(element + ", ");
        }
        System.out.println();

    }

    public int linearSearch(int nums[], int target) {
        int steps = 0;

        for (int i = 0; i < nums.length; i++) {
            steps = i + 1;
            System.out.println("Steps Taken for linear: " + steps);
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public int binarySearch(int nums[], int target) {
        int left = 0;
        int right = nums.length - 1;
        int steps = 0;
        while (left <= right) {
            steps = steps + 1;
            System.out.println("Steps Taken for binary: " + steps);

            int mid = (left + right) / 2;
            if (target == nums[mid])
                return mid;
            else if (target > nums[mid])
                left = mid + 1;
            else
                right = mid - 1;

        }
        return -1;
    }

}

public class Practice {
    public static void main(String[] args) {

        int arr[] = { 3, 8, 4, 2, 9, 1, 10 };
        DSA obj = new DSA();

        int result = obj.linearSearch(arr, 8);
        if (result == -1)
            System.out.println("Linear Search found no Element");
        else
            System.out.println("Linear Search found Element at index: " + result);
        obj.sort(arr);
        result = obj.binarySearch(arr, 8);
        if (result == -1)
            System.out.println("Binary Search found no Element in sorted Array");
        else
            System.out.println("Binary Search found Element at index in the sorted Array: " + result);
    }
}