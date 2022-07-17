# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def mergeTwoLists( list1, list2):        
    l1 = list1
    l2 = list2
    dummy = ListNode()
    out = dummy 
    while l1 and l2 :
        if l1.val < l2.val:
            out.next = l1
            l1 = l1.next
        else:
            out.next = l2
            l2 = l2.next
        out = out.next
    if l1:
        out.next = l1
    elif l2:
        out.next = l2
    return dummy.next
            