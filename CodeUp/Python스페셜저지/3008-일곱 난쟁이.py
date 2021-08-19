"""
CodeUp
3008 : 일곱 난쟁이
https://www.codeup.kr/problem.php?id=3008
"""
d = [int(input()) for i in range(9)]

sum = 0
for i in d :
  sum += i

for i in range(8) :
  for j in range(i+1, 9) :
    if sum - d[i] - d[j] == 100 :
      d.pop(i)
      d.pop(j-1)
      break
  if len(d) == 7 :
    break

d.sort()
for i in d:
  print(i)