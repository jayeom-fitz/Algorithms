"""
CodeUp
6079 : [기초-종합] 언제까지 더해야 할까?(py)
https://www.codeup.kr/problem.php?id=6079
"""
S = int(input())
s = 0
i = 0
while s < S :
  i += 1
  s += i
print(i)