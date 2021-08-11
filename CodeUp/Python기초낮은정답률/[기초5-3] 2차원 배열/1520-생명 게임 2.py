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

d = [[[0 for j in range(b+2)] for i in range(a+2)] for k in range(2)]
e = [[True for j in range(b+2)] for i in range(a+2)]

for i in range(a) :
  array = list(map(int, input().split()))
  for j in range(b) :
    d[0][i+1][j+1] = array[j]

k = int(input())
dy = [-1, -1, -1, 0, 0, 1, 1, 1]
dx = [-1, 0, 1, -1, 1, -1, 0, 1]

for h in range(k) :
  for i in range(1, a+1) :
    for j in range(1, b+1) :
      if not e[i][j] :
        continue
      check = 0
      for k in range(8) :
        check += d[h%2][i+dy[k]][j+dx[k]]

      if d[h%2][i][j] == 0 and check == x :
        d[(h+1)%2][i][j] = 1
      elif d[h%2][i][j] == 1 :        
        if y < z :
          if check >= z or check < y :
            d[(h+1)%2][i][j] = 0
            if check == 0 :
              e[i][j] = False
          else :
            d[(h+1)%2][i][j] = 1
        else :
          if check >= y or check < z :
            d[(h+1)%2][i][j] = 1
          else :
            d[(h+1)%2][i][j] = 0
            if check == 0 :
              e[i][j] = False
      else :
        if check == 0 :
          e[i][j] = False
        d[(h+1)%2][i][j] = 0

for i in range(1, a+1) :
  for j in range(1, b+1) :
    print(d[k%2][i][j], end=' ')
  print()