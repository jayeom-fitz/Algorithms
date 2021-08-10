"""
CodeUp
1460 : [기초-배열연습] 2차원 배열 순서대로 채우기 1-1
https://www.codeup.kr/problem.php?id=1460
"""
n, m = input().split()
n = int(n)
m = int(m)

d = [[0 for j in range(m+1)] for i in range(n+1)]

c = 1
y = 1
x = 1
while c <= n * m :
  d[y][x] = c
  y -= 1
  x += 1
  if y == 0 :
    y = n
    for i in range(1, m+1) :
      if d[y][i] != 0 :
        x = i
        break
  c += 1

for i in range(1, n+1) :
  for j in range(1, m+1) :
    print(d[i][j], end=' ')
  print()