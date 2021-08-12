"""
CodeUp
1551 : [기초-함수작성] 함수로 원하는 값의 위치 리턴하기 1
https://www.codeup.kr/problem.php?id=1551
"""
def f(d, k) :
  for i in range(len(d)) :
    if k == d[i] :
      return i+1
  return -1

n = int(input())
d = list(map(int, input().split()))
k = int(input())

print(f(d, k))