"""
CodeUp
6083 : [기초-종합] 빛 섞어 색 만들기(설명)(py)
https://www.codeup.kr/problem.php?id=6083
"""
r, g, b = input().split()
r = int(r)
g = int(g)
b = int(b)
s = 0
for i in range(r) :
  for j in range(g) :
    for k in range(b) :
      print(i, j, k)
      s += 1
print(s) 