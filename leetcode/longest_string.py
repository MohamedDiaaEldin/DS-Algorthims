def lengthOfLongestSubstring( s):
    max_str = ""
    max_len =  0 
    for c in s:            
        while c in max_str:
            max_str = max_str[1:len(max_str)]                   
        max_str += c 
    max_len = max(max_len, len(max_str))
    return max_len

def lengthOfLongestSubstringSet( s):
    max_str = set()
    l = 0
    max_len =  0 
    
    for i in range(len(s)):            
        c = s[i]
        while c in max_str:           
            max_str.remove(s[l])
            l += 1                
        max_str.add(c)
        max_len = max(max_len, i-l+1)
    return max_len



s = "pwwkew"
print(lengthOfLongestSubstring(s))