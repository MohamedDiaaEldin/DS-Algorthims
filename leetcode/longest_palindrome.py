def longestPalindrome(s):
    longest = 0 
    final_left , final_right  = 0 , 0
    is_even = len(s) % 2 == 0
    print(is_even)
    for i in range(len(s)):                
        right  = i 
        left = i 
        while left >= 0 and right<len(s) and s[left] == s[right]:
            if right - left + 1 > longest:                
                longest = right - left + 1                
                final_left = left
                final_right = right+1
            right +=  1 
            left -= 1     
                        
        right  = i+1 
        left = i       
        while  left >= 0 and right<len(s) and s[left] == s[right]:
            if right - left + 1 > longest:                
                longest = right - left + 1                
                final_left = left
                final_right = right+1
            right +=  1 
            left -= 1                      
        
    return s[final_left: final_right] 

            
print(longestPalindrome("ac"))
print(longestPalindrome("ac"))