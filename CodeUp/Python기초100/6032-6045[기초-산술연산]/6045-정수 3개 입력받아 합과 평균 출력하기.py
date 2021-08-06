"""
CodeUp
6045 : [기초-산술연산] 정수 3개 입력받아 합과 평균 출력하기(설명)(py)
https://www.codeup.kr/problem.php?id=6045
"""
a, b, c = input().split()
s = int(a) + int(b) + int(c)
print( s, format(s / 3, ".2f") ) 