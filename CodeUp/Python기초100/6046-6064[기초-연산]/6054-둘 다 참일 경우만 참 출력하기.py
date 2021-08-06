"""
CodeUp
6054 : [기초-논리연산] 둘 다 참일 경우만 참 출력하기(설명)(py)
https://www.codeup.kr/problem.php?id=6054
"""
a, b = input().split()
print(bool(int(a)) and bool(int(b)))