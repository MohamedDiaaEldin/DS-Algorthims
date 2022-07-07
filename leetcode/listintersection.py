
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

def getIntersectionNode( headA, headB):
    l1 , l2 = headA, headB
    
    while l1 != l2:
        l1 = l1.next if l1 else headB
        l2 = l2.next if l2 else headA
    return l1
        
        
        
#         visited1 = set()
#         cur = headA
#         while cur :
#             visited1.add(cur)
#             cur = cur.next
#         cur = headB
#         while cur :
#             if cur in visited1:
#                 return cur
#             cur = cur.next
           
#         return None 
        