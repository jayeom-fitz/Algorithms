"""
CodeUp
1675 : 시저의 암호 1
https://www.codeup.kr/problem.php?id=1675
"""
s = input()

for i in range(len(s)) :
  if(s[i] == ' ') :
    print(' ', end='')
    continue
  c = ord(s[i]) - 3
  if c < ord('a') :
    c += ord('z') - ord('a') + 1
  print(chr(c), end='')