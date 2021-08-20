"""
CodeUp
3009 : 부분수열의 합
https://www.codeup.kr/problem.php?id=3009
"""
N, S = map(int, input().split())
d = list(map(int, input().split()))

def func(k, s) :
  if k == N :
    return 0

  return (1 if s+d[k] == S else 0) + func(k+1, s+d[k]) + func(k+1, s)
  
print(func(0, 0))