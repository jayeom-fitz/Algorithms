"""
CodeUp
6093 : [기초-리스트] 이상한 출석 번호 부르기2(py)
https://www.codeup.kr/problem.php?id=6093
"""
n = int(input())
a = input().split()

for i in range(n) :
  a[i] = int(a[i])

for i in range(n-1, -1, -1) :
  print(a[i], end=' ')