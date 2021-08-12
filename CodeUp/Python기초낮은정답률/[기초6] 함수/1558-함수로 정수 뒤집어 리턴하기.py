"""
CodeUp
1558 : [기초-함수작성] 함수로 정수 뒤집어 리턴하기
https://www.codeup.kr/problem.php?id=1558
"""
def f(n) :
  k = 0
  while n != 0 :
    k *= 10
    k += n % 10
    n //= 10
  return k

n = int(input())

print(f(n))