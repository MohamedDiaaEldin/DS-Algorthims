
def maxSubArray( nums):
    # o(n)
    max_sum = nums[0]     
    cur_sum = 0
    for i in range(len(nums)):            
        if cur_sum < 0:
            cur_sum = 0   
        cur_sum += nums[i]
        if cur_sum >max_sum:
            max_sum = cur_sum
        
    return max_sum
    
    
    # # O(n^2)
    # max = nums[0]         
    # for i in range(len(nums)):
    #     cur = 0
    #     for j in range(i, len(nums)):
    #         cur += nums[j]
    #         if cur > max :
    #             max = cur
    # return max
    
    # # o(n^3)
    # max = nums[0]    
    # for i in range(len(nums)):           
    #     for j in range(i, len(nums)):
    #         cur = 0
    #         for k in range(i, j+1):                                        
    #             cur += nums[k]  
    #         if cur > max:
    #             max = cur
    # return max
    