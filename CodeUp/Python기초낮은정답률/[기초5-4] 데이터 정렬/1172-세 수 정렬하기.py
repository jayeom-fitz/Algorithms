"""
CodeUp
1172 : 세 수 정렬하기
https://www.codeup.kr/problem.php?id=1172
"""
a, b, c = list(map(int, input().split()))

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

print(a, b, c)
