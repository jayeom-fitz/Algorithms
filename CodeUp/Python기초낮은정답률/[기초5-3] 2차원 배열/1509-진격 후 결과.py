"""
CodeUp
1509 : 진격 후 결과
https://www.codeup.kr/problem.php?id=1509
"""
d = []

for i in range(11) :
  d.append( list(map(int, input().split())) )

for i in range(10) :
  if d[10][i] == 0 :
    continue
  
  j = 9
  result = 0
  while j >= 0 :
    if d[j][i] < 0 :
      result = 2
      break
    elif d[j][i] > 0 :
      result = 1
      break
    else :
      j -= 1
  
  if result == 0 :
    print(i+1, 'safe')
  elif result == 1 :
    print(i+1, 'crash')
  else :
    print(i+1, 'fall')