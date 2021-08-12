"""
CodeUp
3004 : 데이터 재정렬
https://www.codeup.kr/problem.php?id=3004
"""
n = int(input())

d = list(map(int, input().split()))
s = list(d)
s.sort()

for value in d :
  min = 0
  max = n-1
  idx = 0
  while min <= max :
    j = (max + min) // 2
    if value > s[j] :
      min = j + 1
    elif value < s[j] :
      max = j - 1
    else :
      idx = j
      break

  print(idx, end=' ')