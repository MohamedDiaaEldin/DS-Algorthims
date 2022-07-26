
    # time o(n)
    # space o(n)
def containsDuplicate( nums):    
    s = set()
    for i in range(len(nums)):
        if nums[i] in s :
            return True
        s.add(nums[i])
    return False

    for i in range(len(nums)):
        for j in range( i+1, len(nums)):
            if nums[i] == nums[j]:
                return True
    return False
    