"""
CodeUp
1805 : 입체기동장치 생산공장
https://www.codeup.kr/problem.php?id=1805
"""
from functools import cmp_to_key

def comp(a, b) :
  if a[0] > b[0] :
    return 1
  elif a[0] < b[0] :
    return -1
  else :
    return 0

n = int(input())
d = [list(map(int, input().split())) for i in range(n)]

d = sorted(d, key=cmp_to_key(comp))

for data in d :
  print(data[0], data[1])


