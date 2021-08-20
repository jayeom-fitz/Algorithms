"""
CodeUp
5120 : codeup vs koistudy (Tiny)
https://www.codeup.kr/problem.php?id=5120
"""
N = int(input())

l = list(map(int, input().split()))
r = list(map(int, input().split()))
minL = 1001
minR = 1001
ans = 0

for i in range(N) :
  ans += l[i] if l[i] > r[i] else r[i]

  if l[i] > r[i] :
    minL = minL if l[i] - r[i] > minL else l[i] - r[i]
  elif l[i] < r[i] :
    minR = minR if r[i] - l[i] > minR else r[i] - l[i]
  else :
    if minL > 1000 :
      minL = 0
    else :
      minR = 0
    
if minL > 1000 :
  ans -= minR
elif minR > 1000 :
  ans -= minL

print(ans)