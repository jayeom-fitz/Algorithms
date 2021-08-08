"""
CodeUp
1167 : 두 번째 수
https://www.codeup.kr/problem.php?id=1167
"""
a, b, c = input().split()
a = int(a)
b = int(b)
c = int(c)
d = 0

if a > b :
  d = a
  a = b
  b = d

if b > c :
  d = b
  b = c
  c = d

if a > b :
  d = a
  a = b
  b = d
  
print(b)