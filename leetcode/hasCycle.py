
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

# time o(n)
# sapce o(1)
def hasCycle( head):
    slow ,fast = head, head 
    
    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next 
        # if there is a cycle
        if slow == fast:
            return True
    return False

# time o(n) 
# space o(n) 
#         visited = set()
#         cur = head
        
#         while cur:
#             if cur in visited :
#                 return True
#             visited.add(cur)    
#             cur = cur.next
#         return False