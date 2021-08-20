"""
CodeUp
4885 : 물통 (Tiny)
https://www.codeup.kr/problem.php?id=4885
"""
A, B, C, D = map(int, input().split())
visit = [[11 for j in range(B+2)] for i in range(A+2)]
ans = 11

def func(k, a, b) :
  global ans
  if a == C and b == D :
    ans = k
    return

  if k >= ans or k == 10 or visit[a][b] <= k :
    return

  visit[a][b] = k

  func(k+1, A, b)
  func(k+1, a, B)
  func(k+1, 0, b)
  func(k+1, a, 0)

  if a+b <= A :
    func(k+1, a+b, 0)
  else :
    func(k+1, A, a+b-A)

  if a+b <= B :
    func(k+1, 0, a+b)
  else :
    func(k+1, a+b-B, B)

  return

func(0, 0, 0)

if ans <= 10 :
  print(ans)
else :
  print(-1)