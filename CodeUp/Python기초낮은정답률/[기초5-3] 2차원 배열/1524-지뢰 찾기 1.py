"""
CodeUp
1524 : 지뢰 찾기 1
https://www.codeup.kr/problem.php?id=1524
"""
N = 9
d = [[0 for j in range(N+2)] for i in range(N+2)]

for i in range(N) :
  a = list(map(int, input().split()))
  for j in range(N) :
    d[i+1][j+1] = a[j]

r, c = input().split()
r = int(r)
c = int(c)

dy = [-1, -1, -1, 0, 0, 1, 1, 1]
dx = [-1, 0, 1, -1, 1, -1, 0, 1]

answer = 0
if d[r][c] == 1 :
  answer = -1
else :
  check = 0
  for i in range(8) :
    check += d[r+dy[i]][c+dx[i]]
  answer = check

print(answer)