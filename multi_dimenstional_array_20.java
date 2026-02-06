public  class multi_dimenstional_array_20{
    public static void main(String[] args) {
        int nums[][]=new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j]=(int)(Math.random()*10);  // random number generator which is assigning values in multidimenstional array
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        //Enchanced for loop for printing multidimensitonal array
        for(int n[]: nums){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}