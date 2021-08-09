"""
CodeUp
1420 : 3등 찾기
https://www.codeup.kr/problem.php?id=1420
"""
n = int(input())
name = []
score = []

for i in range(n) :
  nn, ss = input().split()
  name.append(nn)
  score.append(int(ss))

for i in range(3) :
  for j in range(n - i - 1) :
    if score[j] > score[j + 1] :
      na = name[j]
      name[j] = name[j + 1]
      name[j + 1] = na
      sa = score[j]
      score[j] = score[j + 1]
      score[j + 1] = sa

print(name[n - 3])