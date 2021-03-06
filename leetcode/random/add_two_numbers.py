class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
        
        
def addTwoNumbers(self, l1, l2):
    prv = 0         
    dummy = ListNode(None, None)
    cur = dummy
    while l1 or l2 or prv:
        val1 = l1.val if l1 else 0
        val2 = l2.val if l2 else 0
        sum = val1 + val2 + prv 
        
        prv = sum / 10  
        sum = sum % 10
        cur.next = ListNode(sum, None) 
        cur = cur.next 
        l1 = l1.next if l1 and l1.next else None 
        l2 = l2.next if l2 and l2.next else None
    return dummy.next
    
