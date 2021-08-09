"""
CodeUp
1283 : 주식 투자
https://www.codeup.kr/problem.php?id=1283
"""
a = int(input())
b = int(input())
r = float(a)
c = input().split()
for i in range(b) :
  d = 100 + int(c[i])
  r *= d / 100

r -= float(a)
print( format(r, '.0f') )
if r > 0 :
  print('good')
elif r < 0 :
  print('bad')
else :
  print('same')