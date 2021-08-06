"""
CodeUp
6056 : [기초-논리연산] 참/거짓이 서로 다를 때에만 참 출력하기(설명)(py)
https://www.codeup.kr/problem.php?id=6056
"""
a, b = input().split()
print(bool(int(a)) != bool(int(b))) 