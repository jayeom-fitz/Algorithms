"""
CodeUp
1281 : 홀수는 더하고 짝수는 빼고 3
https://www.codeup.kr/problem.php?id=1281
"""
a, b = input().split()
a = int(a)
b = int(b)
if a > b :
  c = a
  a = b
  b = c

s = a
if a % 2 == 0 :
  print('-', end='')
  s *= -1
print(a, end='')

for i in range(a + 1, b + 1) :
  if i % 2 == 0 :
    print('-%d'%i, end='' )
    s -= i
  else :
    print('+%d'%i, end='' )
    s += i
print('=%d'%s)