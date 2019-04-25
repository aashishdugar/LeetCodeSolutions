# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        if  l1 is None: return l2
        if l2 is None: return l1
        
        head = ListNode(None)
        a = head
        while l1 and l2:
            if l1.val <= l2.val:
                head.next = ListNode(l1.val)
                l1 = l1.next
            else:
                head.next = ListNode(l2.val)
                l2 = l2.next
            head = head.next
        
        if l1 is None:
            head.next = l2
        if l2 is None:
            head.next = l1
        
        return a.next