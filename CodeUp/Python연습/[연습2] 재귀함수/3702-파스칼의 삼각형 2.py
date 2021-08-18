"""
CodeUp
3702 : 파스칼의 삼각형 2
https://www.codeup.kr/problem.php?id=3702
"""
def pascal(d, r, c) :
  if r == 1 or c == 1 :
    return 1

  if d[r][c] == 0 :
    d[r][c] = ( pascal(d, r-1, c) + pascal(d, r, c-1) ) % 100000000

  return d[r][c]

r, c = map(int, input().split())
d = [[0 for j in range(51)] for i in range(51)]

print(pascal(d, r, c))