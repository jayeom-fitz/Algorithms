"""
CodeUp
6090 : [기초-종합] 수 나열하기3(py)
https://www.codeup.kr/problem.php?id=6090
"""
a, m, d, n = input().split()
a = int(a)
m = int(m)
d = int(d)
n = int(n)
for i in range(2, n+1) :
  a *= m
  a += d 
print(a)