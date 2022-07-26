
def twoSum( nums, target):      
    hashmap = {}
    for i in range(len(nums)):
        num = nums[i]
        wanted = target - num
        if wanted in hashmap:
            return [hashmap.get(wanted), i]
        hashmap[num] = i
    return None
    
    
#         O(n^2)
#         for i in range(len(nums)):
#             for j in range(i+1, len(nums)):
#                 if nums[i] + nums[j] == target :
#                     return [i, j]
#         return None
        
            
            
                