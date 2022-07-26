from this import d


def palindrome_number(num):
    if num < 0 : return False

    div = 1     
    while num  >=  10 * div:
        div *= 10 
    
    while num:
        left = num / div
        right = num % 10 
        if right != left :
            return False
        # remove first and last digites                
        num = (num % div) // 10 
        div /= 100
    return True