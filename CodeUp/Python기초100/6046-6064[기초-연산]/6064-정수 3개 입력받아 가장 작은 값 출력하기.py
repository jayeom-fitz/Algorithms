"""
CodeUp
6064 : [기초-3항연산] 정수 3개 입력받아 가장 작은 값 출력하기(설명)(py)
https://www.codeup.kr/problem.php?id=6064
"""
a, b, c = input().split()
a = int(a)
b = int(b)
c = int(c)
x = (a if (a<=b) else b)
x = (x if (x<=c) else c)
print(x)