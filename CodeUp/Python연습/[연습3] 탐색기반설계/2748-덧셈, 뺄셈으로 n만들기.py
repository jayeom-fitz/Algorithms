"""
CodeUp
2748 : 덧셈, 뺄셈으로 n만들기
https://www.codeup.kr/problem.php?id=2748
"""
m = int(input())
n = int(input())

if n == 0 :
  print(0)
else :
  v = list(map(int, input().split()))

  def func(k, s) :
    if k == n :
      return 1 if s == m else 0
    return func(k+1, s+v[k]) + func(k+1, s-v[k])

  print(func(0, 0))