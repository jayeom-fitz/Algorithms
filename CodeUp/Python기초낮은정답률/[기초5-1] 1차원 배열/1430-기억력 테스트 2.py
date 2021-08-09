"""
CodeUp
1430 : 기억력 테스트 2
https://www.codeup.kr/problem.php?id=1430
"""
# => 메모리 초과
from sys import stdin

n = int(input())
a = set(map(int, stdin.readline().split()))
a = list(a)
m = int(input())
q = list(map(int, stdin.readline().split()))

for i in range(m) :
  flag = False
  for j in range(len(a)) :
    if int(q[i]) == int(a[j]) :
      flag = True
      break
  if flag :
    print('1', end=' ')
  else :
    print('0', end=' ')