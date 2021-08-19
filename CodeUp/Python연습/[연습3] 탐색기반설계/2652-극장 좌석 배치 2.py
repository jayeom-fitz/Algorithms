"""
CodeUp
2652 : 극장 좌석 배치 2
https://www.codeup.kr/problem.php?id=2652
"""
n, k = map(int, input().split())
d = [[0 for j in range(n+1)] for i in range(n+1)]

for i in range(n+1) :
  for j in range(i+1) :
    if j == 0 or j == i:
      d[i][j] = 1
    else :
      d[i][j] = d[i-1][j-1] + d[i-1][j]

def find(d, s, x) :
  if x == 1 :
    return d[n-s+1][1]

  if n - s + 1 < 2 * x - 1 :
    return 0
  elif n - s + 1 == 2 * x - 1:
    return 1

  sum = 0
  for i in range(s, n-1) :
    sum += find(d, i+2, x-1)
  
  return sum

print(find(d, 1, k))