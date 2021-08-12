"""
CodeUp
1566 : [기초-함수작성] 함수로 거듭제곱 리턴하기
https://www.codeup.kr/problem.php?id=1566
"""
def f(a, b) :
  return a ** b

a, b = list(map(int, input().split()))
print(f(a, b))

