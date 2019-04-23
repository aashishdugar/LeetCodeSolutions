# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def deleteDuplicates(self, head):
        current = head
        while(current and current.next):
            if(current.val == current.next.val):
                current.next = current.next.next
            else:
                current = current.next
        return head