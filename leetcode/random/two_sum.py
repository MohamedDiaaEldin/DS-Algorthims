
# time o(n)
# space o(n)
# hashmap
def two_sum_indexes(nums , target):
    inx_map = {}
    for i in  range(len(nums)) :
        required_number = target - nums[i]
        if required_number in inx_map:
            return [i, inx_map.get(required_number)]
        inx_map[nums[i]] = i 

# time  O(n)
# space O(n)
# using set 
def is_two_sum(nums , target):
    reuired = set()
    for i in  range(len(nums)) :
        required_number = target - nums[i]
        if required_number in reuired:
            return True
        reuired.add(nums[i])
    
#  o(n^2)
def twoSumt(nums , target):
    last = len(nums) - 1  
    i = 0
    while i < last :
        if nums[last] + nums[i] == target:
            return [i, last]
        i += 1
        if i == last:
            last -= 1
            i= 0

# o(n^n)
def two_sum(nums, target):
    for i in range(len(nums)):
        for j in range(i+1, len(nums)):
            if nums[j] + nums[i] == target:
                return [j, i]
    

######### 

# nums = [2, 7, 11 ,15]
nums = [1, 2, 4 ,4]
target= 8
print(two_sum_indexes(nums, target))
