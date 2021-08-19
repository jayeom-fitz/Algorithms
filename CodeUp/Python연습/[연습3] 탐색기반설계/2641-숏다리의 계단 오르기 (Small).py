"""
CodeUp
2641 : 숏다리의 계단 오르기 (Small)
https://www.codeup.kr/problem.php?id=2641
"""
n = int(input())
d = [[0 for j in range(3)] for i in range(n+4)]

d[0][0] = 1
for i in range(n) :
  d[i+1][0] += d[i][0] + d[i][1]
  d[i+1][1] += d[i][2]

  d[i+2][0] += d[i][0] + d[i][1]
  d[i+2][1] += d[i][2]

  d[i+3][2] += d[i][0]

print(d[n][0] + d[n][1] + d[n][2])