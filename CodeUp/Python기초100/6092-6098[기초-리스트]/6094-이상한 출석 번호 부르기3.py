"""
CodeUp
6094 : [기초-리스트] 이상한 출석 번호 부르기3(py)
https://www.codeup.kr/problem.php?id=6094
"""
n = int(input())
a = input().split()
min = int(a[0])

for i in range(1, n) :
  if min > int(a[i]) :
    min = int(a[i])

print(min)