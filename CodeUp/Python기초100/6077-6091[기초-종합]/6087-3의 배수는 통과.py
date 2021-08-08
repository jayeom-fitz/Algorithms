"""
CodeUp
6087 : [기초-종합] 3의 배수는 통과(설명)(py)
https://www.codeup.kr/problem.php?id=6087
"""
n = int(input())
for i in range(1, n+1) :
  if i%3==0 :
    continue
  print(i, end=' ')