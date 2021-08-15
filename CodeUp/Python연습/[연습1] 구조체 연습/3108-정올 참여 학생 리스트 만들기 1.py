"""
CodeUp
3108 : 정올 참여 학생 리스트 만들기 1
https://www.codeup.kr/problem.php?id=3108
"""
from functools import cmp_to_key

def comp(a, b) :
  if a[0] < b[0] :
    return -1
  elif a[0] > b[0] :
    return 1
  else :
    return 0

def find(array, number) :
  for i in range(len(array)) :
    if array[i][0] == number :
      return i
  return -1

n = int(input())
d = []
for i in range(n) :
  a, number, name = input().split()
  number = int(number)

  idx = find(d, number)
  if a == 'I' and idx == -1:
    d.append([number, name])
  elif a == 'D' and idx != -1 :
    d.pop(idx)

d = sorted(d, key=cmp_to_key(comp))

idx = list(map(int, input().split()))
for i in idx :
  print(d[i-1][0], d[i-1][1])