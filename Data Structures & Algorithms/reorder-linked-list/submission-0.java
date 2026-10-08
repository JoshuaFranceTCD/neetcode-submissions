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
    public void reorderList(ListNode head) {

        // find middle;
        ListNode start = head, slow = head, fast = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        // reverse the second list;
        ListNode curr = slow.next;
        slow.next = null;

        ListNode prev = null;
        while( curr != null){
            ListNode second = curr.next;
            curr.next = prev;
            prev = curr;
            curr = second;
        }
        // merging the lists;
        ListNode head2 = prev, head1 = head;

        while(head2 != null){
            ListNode t1 = head1.next;
            ListNode t2 = head2.next;
            head1.next = head2;
            head2.next = t1;
            head1 = t1;
            head2 = t2;
        }



        
    }
}
