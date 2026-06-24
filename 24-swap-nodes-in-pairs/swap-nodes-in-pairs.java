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

        while(list != null && list.next != null) {
            ListNode curr = list;
            ListNode ahead = list.next;

            curr.next = ahead.next;
            ahead.next = curr;

            if(prev == null) head = ahead;
            else prev.next = ahead;

            prev = curr;
            list = curr.next;
        }

        return head;
    }
}