"""
CodeUp
1498 : [기초-배열연습] 여러 개씩 묶어 작은 값 골라 배열 만들기 5-7
https://www.codeup.kr/problem.php?id=1498
"""
def min(array) :
  m = 1001
  for i in range(len(array)) :
    if m > array[i] :
      m = array[i]
  return m

n, g = input().split()
n = int(n)
g = int(g)
k = list(map(int, input().split()))

while len(k) % g != 0 :
  k.append(1001)

for i in range(0, len(k), g) :
  print(min(k[i:i+g]), end=' ')
