
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
    
    prv = None
    slow = slow.next
    while slow:
        old_next = slow.next 
        slow.next =  prv  
        prv = slow 
        slow = old_next 
    
    right , left = prv , head
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