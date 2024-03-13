package search;

public class LinearSearch {
    public int linearSearch(int[] list, int target) {
        int n = list.length;
        for (int i = 0; i <= n - 1; i++) {
            if (list[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /*
     * Takes a list and a target. Returns the index of the target if found or -1 if
     * not found
     * 
     * This consumes a lot of time as we have to iterate through the list
     * 
     */
}
