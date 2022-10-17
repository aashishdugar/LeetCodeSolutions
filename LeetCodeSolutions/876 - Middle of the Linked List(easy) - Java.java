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
    public ListNode middleNode(ListNode head) {
        ListNode temp1 = head;
        ListNode temp2 = head;

        while(temp1.next != null) {
            temp1 = temp1.next;
            temp2 = temp2.next;
            if(temp1.next != null) temp1 = temp1.next;
        }

        return temp2;
    }
}