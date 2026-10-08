class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] productBefore = new int[nums.length];
        int[] productAfter = new int[nums.length];
        int[] ans = new int[nums.length];

        productBefore[0] = 1;

        //System.out.print("Prefix: " + productBefore[0]);
        for(int i = 1; i < nums.length; i++){
            productBefore[i] =  productBefore[i-1] * nums[i-1];
            //System.out.print(" "+ productBefore[i]);
        }
        //System.out.print("\nPostfix: ");

         productAfter[nums.length-1] = 1;
        for(int j = nums.length-2; j >= 0; j--){
            productAfter[j] =  productAfter[j+1] * nums[j+1];
        }
        for(int j: productAfter) {
            //System.out.print(" "+ j);
        }
        for(int i = 0; i < nums.length; i++ ) ans[i] = productBefore[i] * productAfter[i];
        return ans;

        
    }
}