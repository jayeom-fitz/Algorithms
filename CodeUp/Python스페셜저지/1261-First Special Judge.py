"""
CodeUp
1261 : First Special Judge (Test)
https://www.codeup.kr/problem.php?id=1261
"""
a = input().split()
b = 0
for i in range(10) :
  if int(a[i]) % 5 == 0 :
    b = int(a[i])
    break

print(b)