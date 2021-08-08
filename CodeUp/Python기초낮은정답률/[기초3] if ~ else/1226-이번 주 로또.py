"""
CodeUp
1226 : 이번 주 로또
https://www.codeup.kr/problem.php?id=1226
"""
a = input().split()
b = input().split()
c = 0
d = 0
i = 0
j = 0
while i != 6 and j != 6 : 
  if int(a[i]) == int(b[j]) :
    i += 1
    j += 1
    c += 1
  elif int(a[i]) > int(b[j]) :
    j += 1
  else :
    i += 1

for i in range(6) :
  if int(b[i]) == int(a[6]) :
    d = 1

if c == 6 :
  print(1)
elif c == 5 :
  if d == 1 :
    print(2)
  else :
    print(3)
elif c == 4 :
  print(4)
elif c == 3:
  print(5)
else :
  print(0)