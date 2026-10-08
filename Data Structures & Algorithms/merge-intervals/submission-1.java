class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        ArrayList<int[]> result = new ArrayList<>();

        for(int [] interval : intervals ){

            if(result.isEmpty()){
                result.add(interval);
            }
            else{
                int [] last = result.get(result.size()-1);
                if(interval[0] <= last[1]){
                    result.get(result.size()-1)[1]  = Math.max(interval[1],last[1]);
                }
                else{
                    result.add(interval);
                }
            }
        }




        return result.toArray(new int[result.size()][]);



        
    }
}
