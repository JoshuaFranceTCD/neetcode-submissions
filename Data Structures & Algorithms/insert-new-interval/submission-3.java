class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        ArrayList<int[]> result = new ArrayList<>();
        boolean found = false;

        for(int[] interval: intervals){
            if(found || interval[1] < newInterval[0]){
                result.add(interval);
            }
            else if(newInterval[1] < interval[0] ){
                result.add(newInterval);
                result.add(interval);
                found = true;
            }
            else{
                newInterval[0] = Math.min(interval[0],newInterval[0]);
                newInterval[1] = Math.max(interval[1],newInterval[1]);
            }
        }
        if(!found) result.add(newInterval);

        return result.toArray(new int[result.size()][]);

        
    }
}
