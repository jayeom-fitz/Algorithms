"""
CodeUp
4791 : 사냥꾼
https://www.codeup.kr/problem.php?id=4791
"""
M, N, L = map(int, input().split())
d = list(map(int, input().split()))
d.sort()

def func(v) :
  left = 0
  right = M - 1
  idx = 0

  if d[left] >= v :
    return 0
  if d[right] <= v :
    return M-1

  while left < right :
    idx = (left + right) // 2
    if d[idx] < v :
      left = idx + 1
    elif d[idx] > v :
      right = idx - 1
    else :
      return idx

  if idx == 0 :
    idx += 1
  elif idx == M-1 :
    idx -= 1
  while idx > 0 and idx < M-1 :
    if abs(d[idx] - a) > abs(d[idx-1] - a) :
      idx -= 1
    elif abs(d[idx] - a) > abs(d[idx+1] - a) :
      idx += 1
    else :
      return idx
  return idx

cnt = 0
for i in range(N) :
  a, b = map(int, input().split())

  if b > L :
    continue
  idx = func(a)
  if abs(d[idx] - a) + b <= L :
    cnt += 1

print(cnt)