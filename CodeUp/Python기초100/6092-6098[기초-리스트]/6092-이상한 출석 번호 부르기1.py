"""
CodeUp
6092 : [기초-리스트] 이상한 출석 번호 부르기1(설명)(py)
https://www.codeup.kr/problem.php?id=6092
"""
n = int(input())
a = input().split()

for i in range(n) :
  a[i] = int(a[i])

d = []
for i in range(24) :
  d.append(0)

for i in range(n) :
  d[a[i]] += 1

for i in range(1, 24) :
  print(d[i], end=' ')