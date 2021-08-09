"""
CodeUp
1253 : a 부터 b까지 출력하기
https://www.codeup.kr/problem.php?id=1253
"""
a, b = input().split()
a = int(a)
b = int(b)
if a > b :
  c = a
  a = b
  b = c

for i in range(a, b + 1) :
  print(i, end=' ')