"""
CodeUp
1368 : 평행사변형 출력하기 2
https://www.codeup.kr/problem.php?id=1368
"""
h, k, d = input().split()
h = int(h)
k = int(k)

for i in range(h) :
  a = 0
  if d == 'L' :
    a = h - i
  else :
    a = i + 1
  for j in range(a, h) :
    print(' ', end='')
  for j in range(k) :
    print('*', end='')
  print()