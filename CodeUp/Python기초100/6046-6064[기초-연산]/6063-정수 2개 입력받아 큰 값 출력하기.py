"""
CodeUp
6063 : [기초-3항연산] 정수 2개 입력받아 큰 값 출력하기(설명)(py)
https://www.codeup.kr/problem.php?id=6063
"""
a, b = input().split()
a = int(a)
b = int(b)
c = (a if (a>=b) else b)
print(int(c))