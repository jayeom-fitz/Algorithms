"""
CodeUp
2651 : 극장 좌석 배치 1
https://www.codeup.kr/problem.php?id=2651
"""
n, k = map(int, input().split())
d = [[0 for j in range(n+1)] for i in range(n+1)]

for i in range(n+1) :
  for j in range(i+1) :
    if j == 0 or j == i:
      d[i][j] = 1
    else :
      d[i][j] = d[i-1][j-1] + d[i-1][j]

print(d[n][k])