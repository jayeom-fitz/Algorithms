"""
CodeUp
1205 : 최댓값
https://www.codeup.kr/problem.php?id=1205
"""
a, b = input().split()
a = float(a)
b = float(b)
max = a + b 

if a - b > max :
  max = a - b

if b - a > max :
  max = b - a

if a * b > max :
  max = a * b

if a / b > max :
  max = a / b

if b / a > max :
  max = b / a

if a ** b > max :
  max = a ** b

if b ** a > max :
  max = b ** a

print(format(max, '.6f'))