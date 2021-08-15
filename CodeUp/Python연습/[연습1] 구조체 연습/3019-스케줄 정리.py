"""
CodeUp
3019 : 스케줄 정리
https://www.codeup.kr/problem.php?id=3019
"""
from functools import cmp_to_key

def comp(a, b) :
  for i in range(1, 4) :
    if a[i] < b[i] :
      return -1
    elif a[i] > b[i] :
      return 1
  if a[0] < b[0] :
    return -1
  elif a[0] > b[0] :
    return 1
  return 0

n = int(input())
d = []
for i in range(n) :
  a = input().split()
  d.append([a[0], int(a[1]), int(a[2]), int(a[3])]) 

d = sorted(d, key=cmp_to_key(comp))

for data in d :
  print(data[0])




