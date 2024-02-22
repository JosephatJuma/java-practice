public class Multi {
    public static void main(String args[]){
        int nums[][] = new int[3][4];
        nums[0][0] = 5;
        nums[0][1] = 2;
        nums[0][2] = 6;
        nums[0][3] = 1;
        nums[1][0] = 3;
        nums[1][1] = 2;
        nums[1][2] = 1;
        nums[1][3] = 7;
        nums[2][0] = 4;
        nums[2][1] = 8;
        nums[2][2] = 1;
        nums[2][3] = 2;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
       }
    }
    
}
