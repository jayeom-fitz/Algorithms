"""
CodeUp
1525 : 크레이지 아케이드
https://www.codeup.kr/problem.php?id=1525
"""
N = 10
d = [[0 for j in range(N+2)] for i in range(N+2)]
b = []

for i in range(N) :
  a = list(map(int, input().split()))
  for j in range(N) :
    d[i+1][j+1] = a[j]
    if a[j] >= 1 :
      b.append([i+1, j+1])

dy = [-1, 1, 0, 0]
dx = [0, 0, -1, 1]
while len(b) > 0 :
  y, x = b.pop(0)
  p = d[y][x]
  d[y][x] = -2
  for i in range(4) :
    for j in range(p) :
      if y+dy[i]*(j+1) < 1 or y+dy[i]*(j+1) > 10 or x+dx[i]*(j+1) < 1 or x+dx[i]*(j+1) > 10 :
        break

      k = d[y+dy[i]*(j+1)][x+dx[i]*(j+1)]
      if k == -1 :
        break
      elif k == -2 or k > 0:
        continue
      else :
        d[y+dy[i]*(j+1)][x+dx[i]*(j+1)] = -2

n = int(input())
ps = []
for i in range(1, n+1) :
  y, x = input().split()
  y = int(y)
  x = int(x)
  if d[y][x] == -2 :
    ps.append('dead')
  else :
    ps.append('survive')
    d[y][x] = i

for i in range(1, N+1) :
  for j in range(1, N+1) :
    print(d[i][j], end=' ')
  print()

print('Character Information')
for i in range(1, n+1) :
  print('player', i, ps[i-1])