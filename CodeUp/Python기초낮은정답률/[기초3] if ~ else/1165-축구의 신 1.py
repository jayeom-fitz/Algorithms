"""
CodeUp
1165 : 축구의 신 1
https://www.codeup.kr/problem.php?id=1165
"""
t, s = input().split()
t = int(t)
s = int(s)
while t < 90 :
  s += 1
  t += 5
print(s)