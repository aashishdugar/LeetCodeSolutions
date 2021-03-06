# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def isPalindrome(self, head: ListNode) -> bool:
        vals = []
        while head != None:
            vals.append(head.val)
            head = head.next
        
        return vals[::-1] == vals 