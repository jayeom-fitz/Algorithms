"""
CodeUp
6058 : [기초-논리연산] 둘 다 거짓일 경우만 참 출력하기(py)
https://www.codeup.kr/problem.php?id=6058
"""
a, b = input().split()
print(not (bool(int(a)) or bool(int(b)))) 