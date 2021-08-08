"""
CodeUp
6084 : [기초-종합] 소리 파일 저장용량 계산하기(py)
https://www.codeup.kr/problem.php?id=6084
"""
h, b, c, s = input().split()
h = int(h)
b = int(b) / 8
c = int(c)
s = int(s)
m = float(h * b * c * s) / 1024 / 1024
print(format(m, ".1f"), 'MB')