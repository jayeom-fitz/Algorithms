"""
CodeUp
3011 : 거품 정렬(Bubble Sort)
https://www.codeup.kr/problem.php?id=3011
"""
n = int(input())

d = list(map(int, input().split()))
s = list(d)
s.sort()

count = 1
for i in range(n) :
  for j in range(n-i-1) :
    if d[j] > d[j+1] :
      d[j], d[j+1] = d[j+1], d[j]
  
  flag = True
  for j in range(n-i-1) :
    if s[j] != d[j] :
      flag = False
      break
    
  if flag :
    break
  count += 1

print(count)