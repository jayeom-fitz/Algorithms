"""
CodeUp
1441 : 버블 정렬
https://www.codeup.kr/problem.php?id=1441
"""
n = int(input())

d = [int(input()) for i in range(n)]

# => 버블 정렬 시간 초과
# for i in range(n) :
#   for j in range(n-i-1) :
#      if d[j] > d[j+1] :
#       d[j], d[j+1] = d[j+1], d[j]

d.sort()

for i in d :
  print(i)