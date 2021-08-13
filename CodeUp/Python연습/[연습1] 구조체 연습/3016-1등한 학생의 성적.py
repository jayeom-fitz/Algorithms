"""
CodeUp
3016 : 1등한 학생의 성적
https://www.codeup.kr/problem.php?id=3016
"""
from functools import cmp_to_key

def comp(a, b) :
  if a[1] > b[1] :
    return -1
  elif a[1] < b[1] :
    return 1
  else : 
    return 0

n = int(input())

names = []
d = []
for i in range(n) :
  a = input().split()
  names.append(a[0])
  d.append([i, int(a[1]), int(a[2]), int(a[3])]) 

first = 0
for a in range(3) :
  data = []
  for b in d :
    data.append([b[0], b[a+1]])
  
  data = sorted(data, key=cmp_to_key(comp))
  for i in range(n) :
    if i == 0 :
      d[data[0][0]][a+1] = 1
    elif data[i-1][1] == data[i][1] :
      d[data[i][0]][a+1] = d[data[i-1][0]][a+1]
    else :
      d[data[i][0]][a+1] = i+1
  
  if a == 0 :
    first = data[0][0]

print(names[first], d[first][2], d[first][3])




