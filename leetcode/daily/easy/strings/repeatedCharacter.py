def repeatedCharacter(s):
    hash_set = set()
    for i in range( len(s)):
        if s[i] in hash_set:
            return s[i]
        else:
            hash_set.add(s[i])
    return None
            

        
print(repeatedCharacter('abcdd'))