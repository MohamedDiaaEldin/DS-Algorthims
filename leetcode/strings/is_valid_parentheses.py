
def isValid( s):
    map = {
        ')': '(',
        '}': '{',
        ']': '['
        }
    stack = []
    for c in  s:        
        if c in map:
            if stack and stack[-1] == map.get(c):
                stack.pop()
            else:
                return False
        else:
            stack.append(c)
    return True if not stack else False
    

s = "({})"
print(isValid(s))