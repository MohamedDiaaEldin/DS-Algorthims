

from os import curdir


class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def isPalindrome(head):
    fast = head 
    slow = head
    
    while fast and fast.next and fast.next.next :
        fast = fast.next.next
        slow = head.next
    
    new_head = ListNode()
    slow = slow.next
    while slow:        
        old_next = slow.next         
        slow.next =  new_head.next  
        new_head = slow 
        slow = old_next 
    
    right , left = new_head , head
    while right and left:
        
        if right.val != left.val :
            return False
        left = left.next 
        right = right.next
    return True

        
    # ## time o(n)
    # ## space o(n)        
    # nums = []
    # while head:
    #     nums.append(head.val)
    #     head = head.next

    # l, r = 0,len(nums)-1
    # while l <= r:
    #     if nums[l] != nums[r]:
    #         return False
    #     l += 1 
    #     r -= 1
    # return True

# [1,2,2,1]
l = ListNode(1, None)
l2 = ListNode(2, l)
l3 = ListNode(2, l2)
head = ListNode(1, l3)

print(isPalindrome(head)) 