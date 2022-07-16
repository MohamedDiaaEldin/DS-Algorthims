
def maxProfit( prices  ):

    left = 0
    right = 1
    highest = 0 
    while right < len(prices):
        if prices[right] < prices[left] :                
            left = right
        elif prices[right] - prices[left] > highest:
            highest = prices[right] - prices[left]
        right += 1
    return highest