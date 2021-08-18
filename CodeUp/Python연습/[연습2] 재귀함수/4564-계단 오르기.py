"""
CodeUp
4564 : 계단 오르기
https://www.codeup.kr/problem.php?id=4564
"""
def max(a, b) :
  return a if a > b else b

n = int(input())
d = [int(input()) for i in range(n)]

m = [[0 for j in range(3)] for i in range(n+3)]
m[1][1] = d[0]

for i in range(2, n+1) :
  m[i][1] = max(m[i-2][1], m[i-2][2]) + d[i-1]
  m[i][2] = m[i-1][1] + d[i-1]

print(max(m[n][1], m[n][2]))