"""
CodeUp
4085 : 농사짓기 가장 좋은 땅 고르기
https://www.codeup.kr/problem.php?id=4085
"""
m, n, x, y = list(map(int, input().split()))

d = [[0 for j in range(m+1)] for i in range(n+1)]

for i in range(n) :
  a = list(map(int, input().split()))
  for j in range(m) :
    d[i+1][j+1] = a[j]

ka = 0
for i in range(y, n+1) :
  for j in range(x, m+1) :
    sum = 0

    for ii in range(i-y+1, i+1):
      for jj in range(j-x+1, j+1):
        sum += d[ii][jj]
    
    if ka < sum :
      ka = sum

print(ka)