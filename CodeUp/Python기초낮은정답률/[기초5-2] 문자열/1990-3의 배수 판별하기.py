"""
CodeUp
1990 : 3의 배수 판별하기
https://www.codeup.kr/problem.php?id=1990
"""
n = input()
s = 0
for i in range(len(n)) :
  s += int(n[i])

if s % 3 == 0 :
  print('1')
else :
  print('0')