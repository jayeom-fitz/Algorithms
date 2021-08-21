"""
CodeUp
1925 : (재귀함수) nCr (Small)
https://www.codeup.kr/problem.php?id=1925
"""
import math
n, r = map(int, input().split())
print(int(math.factorial(n) / (math.factorial(n-r) * math.factorial(r))))
# def func(y, x) :
#   if y < x :
#     return 0

#   if x == 0 or y == 0:
#     return 1

#   return func(y-1, x-1) + func(y-1, x)

# print(func(n, r))