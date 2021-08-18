"""
CodeUp
2626 : (python) 삼각화단 만들기 (Large)
https://www.codeup.kr/problem.php?id=2626
"""
import math

n = int(input())
cnt = 0

for i in range(math.ceil(n / 3), math.ceil(n / 2)) :
  a = n - i
  cnt += (2*i - a) // 2 + 1

print(cnt)