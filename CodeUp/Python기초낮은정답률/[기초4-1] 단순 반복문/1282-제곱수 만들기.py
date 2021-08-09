"""
CodeUp
1282 : 제곱수 만들기
https://www.codeup.kr/problem.php?id=1282
"""
n = int(input())
t = int(n ** 0.5)
if t ** 2 == n :
  t -= 1
k = n - t ** 2
print(k, t)