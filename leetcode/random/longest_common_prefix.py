
def longestCommonPrefix(strs):
    res = ""
    for i in range(len(strs[0])):
        for str in strs:
            if i == len(str) or str[i] != strs[0][i]:
                return res
        res += strs[0][i]
    return res


strs =  ["flower","flow","flight"]
print(longestCommonPrefix(strs))

s =  " "
# print(len(s))