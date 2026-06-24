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
        if(head == null) return null;

        if(head.next == null) return head;
        
        ListNode list = head;

        int count = 0;

        while(list.next != null) {
            if(count % 2 == 0) {
                int temp = list.val;
                list.val = list.next.val;
                list.next.val = temp;
            }
            list = list.next;
            count++;
        }

        return head;
    }
}