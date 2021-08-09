"""
CodeUp
1369 : 빗금 친 사각형 출력하기
https://www.codeup.kr/problem.php?id=1369
"""
n, k = input().split()
n = int(n)
k = int(k)

for i in range(1, n + 1) :
  for j in range(1, n + 1) :
    if i == 1 or j == 1 or i == n or j == n :
      print('*', end='')
    else :
      if (i + j - 1) % k == 0 :
        print('*', end='')
      else :
        print(' ', end='')
  print()