"""
CodeUp
1476 : [기초-배열연습] 2차원 배열 빗금 채우기 3-1
https://www.codeup.kr/problem.php?id=1476
"""
n, m = input().split()
n = int(n)
m = int(m)

d = [[0 for j in range(m+1)] for i in range(n+1)]

c = 1
y = 1
x = 1
while c < n * m :
  d[y][x] = c
  y -= 1
  x += 1
  if y == 0 or x == m + 1 :
    a = 1
    b = 1
    while d[a][b] != 0 :
      if a == n :
        b += 1
      else :
        a += 1
    y = a
    x = b
  c += 1

d[n][m] = n * m

for i in range(1, n+1) :
  for j in range(1, m+1) :
    print(d[i][j], end=' ')
  print()