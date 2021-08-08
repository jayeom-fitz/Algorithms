"""
CodeUp
6088 : [기초-종합] 수 나열하기1(py)
https://www.codeup.kr/problem.php?id=6088
"""
a, d, n = input().split()
a = int(a)
d = int(d)
n = int(n)
s = a + (n - 1) * d
print(s)