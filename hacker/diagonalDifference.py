def diagonalDifference(arr):
    d =  0
    for i in range(0, len(arr)):
      d += arr[i][i]
      d -= arr[i][len(arr) - (i+1)]     