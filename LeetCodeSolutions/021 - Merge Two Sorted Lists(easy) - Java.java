/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        ListNode l3 = new ListNode(-1);
        ListNode head = l3;
        
        while((l1 != null) && (l2 != null)) 
        {
            if (l1.val <= l2.val)
            {
                l3.next = l1;
                l3 = l3.next;
                l1 = l1.next;

            }
            else if (l1.val > l2.val)
            {
                l3.next = l2;
                l3 = l3.next;
                l2 = l2.next;
            }
        }
        
        if( l1 == null)
        {
            while(l2 != null)
            {
                l3.next = l2;
                l3 = l3.next;
                l2 = l2.next;
            }
        }
        else if (l2 == null)
        {
            while(l1 != null)
            {
                l3.next = l1;
                l3 = l3.next;
                l1 = l1.next;
            }
            
        }
            
        return head.next;
    }
    
}