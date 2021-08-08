"""
CodeUp
1180 : 만능 휴지통
https://www.codeup.kr/problem.php?id=1180
"""
n = int(input())
n = ((n % 10) * 10 + n // 10) * 2

if n >= 100 :
  n -= 100

print(n)
if n > 50 :
  print('OH MY GOD')
else :
  print('GOOD')