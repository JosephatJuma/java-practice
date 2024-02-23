public class Multi {
    public static void main(String args[]) {
        // int nums[][] = new int[3][4];
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 4; j++) {
        // nums[i][j] = (int) (Math.random() * 10);
        // // nums[i][j] = j * i;
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 4; j++) {
        // System.out.print(nums[i][j] + " ");
        // }
        // System.out.println();
        // }
        // System.out.println();

        // for (int n[] : nums) {
        // for (int m : n) {
        // System.out.print(m + " ");
        // }
        // System.out.println();
        // }

        // Jagged array
        // int nums2[][] = new int[3][];
        // nums2[0] = new int[3];
        // nums2[1] = new int[4];
        // nums2[2] = new int[2];

        // for (int i = 0; i < nums2.length; i++) {
        // for (int j = 0; j < nums2[i].length; j++) {
        // nums2[i][j] = (int) (Math.random() * 10);
        // }
        // }
        // // the enhanced for loop auto detects the size of the array
        // for (int n[] : nums2) {
        // for (int m : n) {
        // System.out.print(m + " ");
        // }
        // System.out.println();
        // }

        // three dimensional array
        int numbers[][][] = new int[4][4][4];

        // for (int i = 0; i < numbers.length; i++) {
        // for (int j = 0; j < numbers[i].length; j++) {
        // for (int k = 0; k < numbers[i][j].length; k++) {
        // numbers[i][j][k] = (int) (Math.random() * 10);
        // }
        // }
        // }
        // for (int n[][] : numbers) {
        // for (int m[] : n) {
        // for (int l : m) {
        // System.out.print(l + " ");
        // }
        // System.out.print("|");
        // }
        // System.out.println();

        // }

        // four dimensional array
        int values[][][][] = new int[4][4][4][4];
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[1].length; j++) {
                for (int k = 0; k < values[i][j].length; k++) {
                    for (int l = 0; l < values[i][j][k].length; l++) {
                        values[i][j][k][l] = (int) (Math.random() * 10);
                    }
                }
            }
        }

        for (int n[][][] : values) {
            for (int m[][] : n) {
                for (int o[] : m) {
                    for (int p : o) {
                        System.out.print(p + " ");

                    }
                    System.out.print("|");
                }
                System.out.println();
            }
        }
    }

}
