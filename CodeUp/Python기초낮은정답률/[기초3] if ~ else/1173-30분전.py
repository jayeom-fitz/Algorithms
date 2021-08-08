"""
CodeUp
1173 : 30분전
https://www.codeup.kr/problem.php?id=1173
"""
h, m = input().split()
h = int(h)
m = int(m) - 30

if m < 0 :
  m += 60
  h -= 1
  if h < 0 :
    h += 24

print(h, m)