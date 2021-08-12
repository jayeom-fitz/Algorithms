"""
CodeUp
1542 : [기초-함수작성] 함수로 prime 또는 composite 출력하기
https://www.codeup.kr/problem.php?id=1542
"""
def f(n) :
  i = 2
  while i <= n ** 0.5 :
    if n % i == 0 :
      return 'composite'
    i += 1
  return 'prime'

n = int(input())

print(f(n))