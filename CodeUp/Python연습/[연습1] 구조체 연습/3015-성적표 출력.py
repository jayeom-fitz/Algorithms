"""
CodeUp
3015 : 성적표 출력
https://www.codeup.kr/problem.php?id=3015
"""
from functools import cmp_to_key

def comp(a, b) :
  if a[2] > b[2] :
    return -1
  elif a[2] < b[2] :
    return 1
  else :
    if a[0] > b[0] :
      return 1
    elif a[0] < b[0] :
      return -1  
  return 0

n, m = list(map(int, input().split()))

d = []
for i in range(1, n+1) :
  name, score = input().split()
  d.append([i, name, int(score)]) 

d = sorted(d, key=cmp_to_key(comp))

for i in range(m) :
  print(d[i][1])


