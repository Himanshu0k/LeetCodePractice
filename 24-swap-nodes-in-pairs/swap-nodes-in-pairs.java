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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode list = head;
        ListNode prev = null;

        // int count = 0;

        while(list != null && list.next != null) {
            // if(count % 2 == 0) {
                ListNode curr = list;
                ListNode ahead = list.next;

                curr.next = ahead.next;
                ahead.next = curr;

                if(prev == null) head = ahead;
                else prev.next = ahead;

                prev = curr;
                list = curr.next;
            // }
            // else list = list.next;
            // count++;
        }

        return head;
    }
}