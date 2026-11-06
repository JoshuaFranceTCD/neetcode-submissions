/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        boolean nodesLeft = true;

        ListNode start = new ListNode();
        ListNode cur = start;
        while(nodesLeft){
            int index = 0;
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < lists.length; i++){
                if(lists[i] != null && lists[i].val < min){
                    index = i;
                    min = lists[i].val;
                }
            }
            if(min == Integer.MAX_VALUE){
                cur.next = null;
                nodesLeft = false;
            }
            else{
                cur.next = new ListNode(min,new ListNode());
                lists[index] = lists[index].next;
                cur = cur.next;
            }
        }
        start = start.next;


        return start;

    }
}
