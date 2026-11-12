class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> triplets = new ArrayList<List<Integer>>();
        int[] sorted = new int[nums.length];
        for(int i = 0; i < sorted.length;i++){
            sorted[i] = nums[i];
        } 

        Arrays.sort(sorted);

        for(int i = 0;  i < sorted.length; i ++ ){
            if(sorted[i]> 0) break;
            if (i > 0 && sorted[i] == sorted[i-1]) continue; // to ignore duplixates

            int j = i + 1;
            int k = sorted.length - 1;
            while(j < k){
                int sum = sorted[j] + sorted[k] + sorted[i];
                if ( sum > 0 ) k--;
                else if ( sum < 0 ) j++;
                else  {
                    //System.out.print(sum);
                    triplets.add(Arrays.asList(sorted[i], sorted[j],sorted[k]));
                    j++;
                    k--;
                    while( j < k && sorted[j] == sorted[j-1]) j++; //to ignore duplicates
                }
            }
        }

        return triplets;
        
    }
}