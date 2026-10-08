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
    public boolean canAttendMeetings(List<Interval> intervals) {
        for(int i = 0; i < intervals.size(); i++){
            Interval first = intervals.get(i);
            for(int j = i + 1; j < intervals.size(); j++){
                Interval second = intervals.get(j);
                if(first == second) continue;
                if(first.start == second.start) return false;
                if(first.start < second.start && second.start < first.end ) return false;
                if(first.start > second.start && first.start < second.end) return false;
            }
        }
        return true;

    }
}
