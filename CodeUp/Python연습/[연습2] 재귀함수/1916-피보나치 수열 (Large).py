"""
CodeUp
1916 : (재귀함수) 피보나치 수열 (Large)
https://www.codeup.kr/problem.php?id=1916
"""
import numpy as np;

def fibonacci(a, n) :
  if n == 1 or n == 2 :
    return 1
  elif a[n] == 0 :
    a[n] = (fibonacci(a, n-1) + fibonacci(a, n-2)) % 10009
    return int(a[n])
  else :
    return int(a[n])

n = int(input())
d = np.zeros(201)

print(fibonacci(d, n))