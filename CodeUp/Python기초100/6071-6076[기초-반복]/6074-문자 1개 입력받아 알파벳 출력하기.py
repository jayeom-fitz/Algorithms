"""
CodeUp
6074 : [기초-반복실행구조] 문자 1개 입력받아 알파벳 출력하기(설명)(py)
https://www.codeup.kr/problem.php?id=6074
"""
c = ord(input())
t = ord('a')
while t<=c :
  print(chr(t), end=' ')
  t += 1