"""
CodeUp
1535 : [기초-함수작성] 함수로 가장 큰 값 위치 리턴하기
https://www.codeup.kr/problem.php?id=1535
"""
def f(n, d) :
  s = sorted(d)
  return d.index(s[n-1]) + 1

n = int(input())
d = list(map(int, input().split()))

print(f(n, d))