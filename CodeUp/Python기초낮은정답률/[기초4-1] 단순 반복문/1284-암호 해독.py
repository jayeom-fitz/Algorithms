"""
CodeUp
1284 : 암호 해독
https://www.codeup.kr/problem.php?id=1284
"""
n = int(input())

flag = False
if n < 4 :
  flag = True
else :
  a = 2
  flag = True
  while a <= n ** 0.5 :
    if n % a == 0 :
      flag = False
      break
    a += 1

if flag :
  print('wrong number')
else :
  a = 2
  flag = True
  while a <= n ** 0.5 :
    if n % a == 0 :
      x = a
      y = n // a
      b = 2
      flag2 = True
      while flag2 and b <= x ** 0.5 :
        if x % b == 0 :
          flag2 = False
          break
        b += 1
      b = 2
      while flag2 and b <= y ** 0.5 :
        if y % b == 0 :
          flag2 = False
          break
        b += 1
      if flag2 :
        print(x, y)
        flag = False
        break
    a += 1
  if flag :
    print('wrong number')

