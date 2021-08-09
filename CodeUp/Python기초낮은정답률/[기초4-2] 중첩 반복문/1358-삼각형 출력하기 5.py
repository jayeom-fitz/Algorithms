"""
CodeUp
1358 : 삼각형 출력하기 5
https://www.codeup.kr/problem.php?id=1358
"""
n = int(input())

for i in range(1, n // 2 + 2) :
  for j in range(n // 2 + 1
   - i) :
    print(' ', end='')
  for j in range(i * 2 - 1) :
    print('*', end='')
  print()