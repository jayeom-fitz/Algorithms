"""
CodeUp
3002 : 기억력 테스트 3
https://www.codeup.kr/problem.php?id=3002
"""
n = int(input())
nd = list(map(int, input().split()))
m = int(input())
md = list(map(int, input().split()))

def func(v) :
  left = 0
  right = n - 1
  idx = 0

  while left <= right :
    idx = (left + right) // 2
    if nd[idx] < v :
      left = idx + 1
    elif nd[idx] > v :
      right = idx - 1
    else :
      return idx + 1

  return -1

for i in range(m) :
  print(func(md[i]), end=' ')