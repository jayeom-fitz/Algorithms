"""
CodeUp
6089 : [기초-종합] 수 나열하기2(py)
https://www.codeup.kr/problem.php?id=6089
"""
a, d, n = input().split()
a = int(a)
d = int(d)
n = int(n)
s = a * ( d ** (n - 1) )
print(s)