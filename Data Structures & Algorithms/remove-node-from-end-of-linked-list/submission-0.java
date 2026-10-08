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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int length = 0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            length++;
        }
        ListNode prev = null;
        curr = head;

        for(int i = 0; i < length - n; i++){
            prev = curr;
            curr = curr.next;
        }
        if(prev == null){
            head = head.next;
            return head;
        }
        prev.next = curr.next;
        return head;

    }
}
