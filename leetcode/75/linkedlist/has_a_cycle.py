def hasCycle(head):        
    # time o(n)
    # space o(1)
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
    # visited = set()
    # cur = head

    # while cur:
    #     if cur in visited :
    #         return True
    #     visited.add(cur)    
    #     cur = cur.next
    # return False