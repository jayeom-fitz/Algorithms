"""
CodeUp
6097 : [기초-리스트] 설탕과자 뽑기(py)
https://www.codeup.kr/problem.php?id=6097
"""
# List Comprehensions
w, h = input().split()
a = [[0 for j in range(int(h) + 1)] for i in range(int(w) + 1)]

n = int(input())
for z in range(n) :
  l, d, x, y = input().split()
  l = int(l)
  d = int(d)
  x = int(x)
  y = int(y)
  if d == 0 :
    for i in range(y, y + l) :
      a[x][i] = 1
  else :
    for i in range(x, x + l) :
      a[i][y] = 1

for i in range(1, int(w) + 1) :
  for j in range(1, int(h) + 1) : 
    print(a[i][j], end=' ')
  print() 