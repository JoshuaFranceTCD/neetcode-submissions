class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            int n = nums[i];
            freq.put(n,freq.getOrDefault(n,0) + 1);
        }
        System.out.println(freq);
        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            int[] curr = new int[2];
            curr[0] = entry.getValue();
            curr[1] = entry.getKey();
            arr.add(curr);
        }
        arr.sort((a,b) -> Integer.compare(b[0],a[0]));

        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = arr.get(i)[1];
        }

        return result;
        
    }
}
