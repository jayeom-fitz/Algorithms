"""
CodeUp
2628 : 케익 자르기
https://www.codeup.kr/problem.php?id=2628
"""
a, b = map(int, input().split())
c, d = map(int, input().split())

if a > b :
  a, b = b, a

if c > d :
  c, d = d, c

if (a < c or a > d) != (b < c or b > d) :
  print('cross')
else :
  print("not cross")