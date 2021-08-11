"""
CodeUp
1520 : 생명 게임 2
https://www.codeup.kr/problem.php?id=1520
"""
# => 시간 초과
a, b = input().split()
a = int(a)
b = int(b)

x, y, z = input().split()
x = int(x)
y = int(y)
z = int(z)

d = [[0 for j in range(b+2)] for i in range(a+2)]

q = []
r = []

for i in range(a) :
  array = list(map(int, input().split()))
  for j in range(b) :
    d[i+1][j+1] = array[j]
    if array[j] == 1 :
      r.append([i+1, j+1])

k = int(input())
dy = [-1, -1, -1, 0, 0, 0, 1, 1, 1]
dx = [-1, 0, 1, -1, 0, 1, -1, 0, 1]

for h in range(k) :
  c = [[0 for j in range(b+2)] for i in range(a+2)]
  e = [[0 for j in range(b+2)] for i in range(a+2)]

  while len(r) > 0 :
    data = r.pop(0)
    for i in range(9) :
      Y = data[0]+dy[i]
      X = data[1]+dx[i]
      if c[Y][X] == 0 :
        c[Y][X] = 1
        if not ( Y <= 0 or Y > a or X <= 0 or X > b ) : 
          q.append([Y, X])

  while len(q) > 0 :
    data = q.pop(0)
    check = 0
    for i in range(9) :
      if i == 4:
        continue
      check += d[data[0]+dy[i]][data[1]+dx[i]]

    Y = data[0]
    X = data[1]
    if d[Y][X] == 0 and check == x :
      e[Y][X] = 1
    elif d[Y][X] == 1 :        
      if y < z :
        if check >= z or check < y :
          e[Y][X] = 0
        else :
          e[Y][X] = 1
      else :
        if check >= y or check < z :
          e[Y][X] = 1
        else :
          e[Y][X] = 0
    else :
      e[Y][X] = 0
    
    if e[Y][X] == 1 :
      r.append(data)

  d = list(e)

for i in range(1, a+1) :
  for j in range(1, b+1) :
    print(d[i][j], end=' ')
  print()