"""
CodeUp
6098 : [기초-리스트] 성실한 개미(py)
https://www.codeup.kr/problem.php?id=6098
"""
# List Comprehensions
d = [[0 for j in range(10)] for i in range(10)]

for i in range(10) :
  a = input().split()
  for j in range(10) : 
    d[i][j] = int(a[j])

a = True
y = 1
x = 1
while a :
  d[y][x] = 9
  if d[y][x + 1] == 0 :
    x += 1
  elif d[y + 1][x] == 0 :
    y += 1
  else :
    a = False
    if d[y][x + 1] == 2 :
      d[y][x + 1] = 9
    elif d[y + 1][x] == 2 :
      d[y + 1][x] = 9

for i in range(10) :
  for j in range(10) : 
    print(d[i][j], end=' ')
  print() 