"""
CodeUp
1425 : 자리 배치
https://www.codeup.kr/problem.php?id=1425
"""
n, c = input().split()
h = input().split()

for i in range(int(n) - 1) :
  for j in range(int(n) - i - 1) :
    if int(h[j]) > int(h[j + 1]) :
      ha = h[j]
      h[j] = h[j + 1]
      h[j + 1] = ha

for i in range(1, int(n) + 1) :
  print(h[i - 1], end=' ')
  if i % int(c) == 0 :
    print()