"""
CodeUp
3704 : 계단 오르기 2
https://www.codeup.kr/problem.php?id=3704
"""
n = int(input())
d = [0 for i in range(n + 5)]
d[0] = 1

for i in range(n) :
  d[i+1] += d[i]
  d[i+1] %= 1000

  d[i+2] += d[i]
  d[i+2] %= 1000

  d[i+3] += d[i]
  d[i+3] %= 1000

print(d[n])