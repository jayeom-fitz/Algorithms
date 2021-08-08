"""
CodeUp
1218 : 삼각형 판단하기
https://www.codeup.kr/problem.php?id=1218
"""
a, b, c = input().split()
a = int(a)
b = int(b)
c = int(c)

if a + b <= c :
  print('삼각형아님')
elif a == b and b == c :
  print('정삼각형')
elif a == b or b == c :
  print('이등변삼각형')
elif a ** 2 + b ** 2 == c ** 2 :
  print('직각삼각형')
else :
  print('삼각형')