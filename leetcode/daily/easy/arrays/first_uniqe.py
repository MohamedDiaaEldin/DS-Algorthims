    
def firstUniqChar( s):
    hash_map = {}
    for c in s:
        if c in hash_map:
            hash_map[c] = hash_map[c] + 1 
        else:
            hash_map[c] = 1        
    
    for i in range(len(s)):            
        if  hash_map.get(s[i]) == 1:
            return i
    return -1
        
        

print(firstUniqChar('aabb'))