/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int maxOverlap = 1;
        int[] starts = new int[intervals.size()];
        int[] endings = new int[intervals.size()];
        for(int i = 0; i < intervals.size(); i++){
            starts[i] = intervals.get(i).start;
            endings[i] = intervals.get(i).end;

        }
        Arrays.sort(starts);
        Arrays.sort(endings);
        int  e = 0, s = 0,count = 0,max = 0;
        while(s < intervals.size()){
            if(starts[s] <  endings[e]){
                count++;
                s++;
            }
            else{
                e++;
                count--;
            }
            max = Math.max(max,count);

        }
        return max;

    }
}
