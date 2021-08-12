"""
CodeUp
1536 : [기초-함수작성] 함수로 가장 작은 값 리턴하기
https://www.codeup.kr/problem.php?id=1536
"""
def f(d) :
  s = sorted(d)
  return s[0]

n = int(input())
d = list(map(int, input().split()))

print(f(d))