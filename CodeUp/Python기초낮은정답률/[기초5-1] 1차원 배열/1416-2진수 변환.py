"""
CodeUp
1416 : 2진수 변환
https://www.codeup.kr/problem.php?id=1416
"""
n = int(input())
s = []
if n == 0 :
  s.append(0)
else :
  while n != 0 :
    s.append(n % 2)
    n //= 2
for i in range(len(s)-1, -1, -1) :
  print(s[i], end='')