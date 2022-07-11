def lengthOfLastWord( s):
    words = s.split(' ')
    i = 1
    last = words[-i]
    while len(last) == 0:
        i += 1        
        last = words[-i]
    return len(last)

s = "   fly me   to   the moon  "
print(lengthOfLastWord(s))