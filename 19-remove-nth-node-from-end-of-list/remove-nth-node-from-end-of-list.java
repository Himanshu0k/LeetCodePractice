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
        ListNode check = head;
        int size = 0;

        while(check != null) {
            check = check.next;
            size++;
        }

        ListNode list = head;
        ListNode prev = null;
        int count = 0;

        while(list != null) {
            if(count == size-n) {
                if(count == 0) {
                    head = head.next;
                }
                else {
                    prev.next = list.next;
                }
                break;
            }
            count++;
            prev = list;
            list = list.next;
        }

        return head;
    }
}