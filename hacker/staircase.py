def staircase(n):
    # Write your code here     
    for i in range(n):
        str = ''        
        j = 0 
        while j < n-i-1 : 
            str += " "
            j += 1
        while j<n :
            str += "#"
            j += 1
        print(str)

staircase(6)