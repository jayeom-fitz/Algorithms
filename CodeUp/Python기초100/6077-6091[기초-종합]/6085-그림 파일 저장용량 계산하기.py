"""
CodeUp
6085 : [기초-종합] 그림 파일 저장용량 계산하기(py)
https://www.codeup.kr/problem.php?id=6085
"""
w, h, b = input().split()
w = int(w)
h = int(h)
b = int(b)
m = float(w * h * b) / 8 / 1024 / 1024
print(format(m, ".2f"), 'MB')