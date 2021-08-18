"""
CodeUp
1920 : (재귀함수) 2진수 변환
https://www.codeup.kr/problem.php?id=1920
"""
def binary(n) :
  if n == 0 :
    return
  
  binary(n // 2)
  print(n % 2, end='')

n = int(input())

if n == 0 :
  print(0)
else :
  binary(n)