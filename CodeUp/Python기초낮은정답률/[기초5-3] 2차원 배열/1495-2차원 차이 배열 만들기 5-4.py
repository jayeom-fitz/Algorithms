"""
CodeUp
1495 : [기초-배열연습] 2차원 차이 배열 만들기 5-4
https://www.codeup.kr/problem.php?id=1495
"""
n, m, k = input().split()
n = int(n)
m = int(m)
k = int(k)

a = [[0 for j in range(m+1000)] for i in range(n+1000)]

for i in range(k) :
  x1, y1, x2, y2, u = input().split()
  x1 = int(x1)
  y1 = int(y1)
  x2 = int(x2)
  y2 = int(y2)
  u = int(u)

  a[x1][y1] += u
  a[x2+1][y2+1] += u
  a[x1][y2+1] -= u
  a[x2+1][y1] -= u

for i in range(n) :
  for j in range(m) :
    print(a[i][j], end=' ')
  print()
print()

for i in range(n) :
  sum = 0
  for j in range(m) :
    sum += a[i][j]
    a[i][j] = sum

for j in range(m) :
  sum = 0
  for i in range(n) :
    sum += a[i][j]
    a[i][j] = sum

for i in range(n) :
  for j in range(m) :
    print(a[i][j], end=' ')
  print()