"""
CodeUp
1565 : [기초-함수작성] 함수로 최소공배수 리턴하기
https://www.codeup.kr/problem.php?id=1565
"""
def gcd(p, q) :
  if q == 0 : 
    return p; 
  return gcd(q, p % q);

def f(a, b) :
  return int(a * b // gcd(a, b))

a, b = list(map(int, input().split()))
if a < b:
	a, b = b, a
print(f(a, b))

