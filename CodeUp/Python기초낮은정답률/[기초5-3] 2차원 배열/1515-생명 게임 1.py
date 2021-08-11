"""
CodeUp
1515 : 생명 게임 1
https://www.codeup.kr/problem.php?id=1515
"""
N = 25
d1 = [[0 for j in range(N+2)] for i in range(N+2)]
d2 = [[0 for j in range(N+2)] for i in range(N+2)]

for i in range(N) :
  a = list(map(int, input().split()))
  for j in range(N) :
    d1[i+1][j+1] = a[j]

dy = [-1, -1, -1, 0, 0, 1, 1, 1]
dx = [-1, 0, 1, -1, 1, -1, 0, 1]

for i in range(1, N+1) :
  for j in range(1, N+1) :
    check = 0
    for k in range(8) :
      check += d1[i+dy[k]][j+dx[k]]
    if d1[i][j] == 0 and check == 3 :
      d2[i][j] = 1
    elif d1[i][j] == 1 :
      if check == 2 or check == 3 :
        d2[i][j] = 1
      else :
        d2[i][j] = 0

for i in range(1, N+1) :
  for j in range(1, N+1) :
    print(d2[i][j], end=' ')
  print()