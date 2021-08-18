"""
CodeUp
2631 : 보물 찾기
https://www.codeup.kr/problem.php?id=2631
"""
n, k = map(int, input().split())
d = list(map(int, input().split()))
m = [0 for i in range(n)]
cnt = 0

left = 0
m[0] = d[0]
for i in range(1, n) :
  m[i] = m[i-1] + d[i]
  if m[i] > k :
    while left < i and m[i] > k :
      m[i] -= d[left]
      left += 1

  if m[i] == k :
    cnt += 1

print(cnt)
