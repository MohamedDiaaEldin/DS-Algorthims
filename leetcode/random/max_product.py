
# on(n)
def maxProduct( nums):
    max_product = nums[0]
    for i in range(len(nums)):
        cur = 1
        for j in range(i, len(nums)):
            cur *= nums[j]
            if cur > max_product:
                max_product = cur
    return max_product
    