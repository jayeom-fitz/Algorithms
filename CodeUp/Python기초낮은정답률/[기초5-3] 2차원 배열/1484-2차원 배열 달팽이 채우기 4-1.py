"""
CodeUp
1484 : [기초-배열연습] 2차원 배열 달팽이 채우기 4-1
https://www.codeup.kr/problem.php?id=1484
"""
n, m = input().split()
n = int(n)
m = int(m)

d = [[0 for j in range(m+2)] for i in range(n+2)]

c = 1
y = 1
x = 1
dirX = 1
dirY = 0
while c <= n * m :
  d[y][x] = c
  if d[y+dirY][x+dirX] != 0 or y+dirY == 0 or y+dirY > n or x+dirX == 0 or x+dirX > m :
    if dirX == 1 :
      dirX = 0
      dirY = 1
    elif dirX == -1 :
      dirX = 0
      dirY = -1
    elif dirY == 1 :
      dirX = -1
      dirY = 0
    else :
      dirX = 1
      dirY = 0
  y += dirY
  x += dirX
  c += 1

for i in range(1, n+1) :
  for j in range(1, m+1) :
    print(d[i][j], end=' ')
  print()