"""
CodeUp
3017 : 정렬 기준
https://www.codeup.kr/problem.php?id=3017
"""
from functools import cmp_to_key

def compare(x, y) :
  if x[1] < y[1] : 
	  return 1 
  elif x[1] > y[1] :
    return -1
  
  if x[2] < y[2] : 
    return 1
  elif x[2] > y[2] :
    return -1
  
  if x[0] > y[0] :
    return 1
  else :
    return -1

n = int(input())
d = []

for i in range(n) :
  l = list(map(int, input().split()))
  d.append([i+1, l[0], l[1]])

s = sorted(d, key=cmp_to_key(compare))

for data in s :
  print(data[0], data[1], data[2])