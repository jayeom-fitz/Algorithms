"""
CodeUp
3109 : 정올 참여 학생 리스트 만들기 2
https://www.codeup.kr/problem.php?id=3109
"""
def find(array, number, check) :
  L = 0
  R = len(array) - 1
  idx = 0

  while L <= R :
    idx = int((L + R) / 2)
    
    if array[idx][0] < number :
      L = idx + 1
    elif array[idx][0] > number :
      R = idx - 1
    else :
      while True :
        if idx == 0 :
          return idx
        elif array[idx][0] == array[idx-1][0] :
          idx -= 1
        else :
          return idx

  
  if check :
    if array[len(array)-1][0] < number :
      return len(array)
    elif array[0][0] > number :
      return 0

    while True :
      if array[idx-1][0] > number :
        idx -= 1
      elif array[idx][0] < number :
        idx += 1
      else :
        return idx
  else :
    return -1

n = int(input())
d = []
for i in range(n) :
  a, number, name = input().split()
  number = int(number)

  if len(d) == 0 :
    if a == 'I':
      d.insert(0, [number, name])
    else :
      continue
  else :
    if a == 'I':
      idx = find(d, number, True)
      d.insert(idx, [number, name])
    else :
      idx = find(d, number, False)
      if idx != -1:
        d.pop(idx)


idx = input().split()
for i in idx :
  a = int(i)
  print(d[a-1][0], d[a-1][1])