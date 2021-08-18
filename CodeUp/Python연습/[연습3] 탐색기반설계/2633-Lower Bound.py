"""
CodeUp
2633 : Lower Bound
https://www.codeup.kr/problem.php?id=2633
"""
n, k = map(int, input().split())
d = list(map(int, input().split()))

if d[n-1] < k :
  print(n+1)
elif d[0] >= k :
  print(1)
else :
  left = 0
  right = n-1
  idx = 0
  while left <= right :
    idx = (left + right) // 2

    if d[idx] < k :
      left = idx + 1
    else :
      right = idx - 1

  while d[idx] == k :
    idx -= 1

  while d[idx] < k :
    idx += 1

  print(idx+1)