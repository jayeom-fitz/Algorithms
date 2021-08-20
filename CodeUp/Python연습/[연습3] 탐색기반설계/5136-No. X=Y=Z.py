"""
CodeUp
5136 : No. X=Y=Z
https://www.codeup.kr/problem.php?id=5136
"""
n = list(map(int, input().split()))
n.sort()

ans = 0
while n[0] != n[2] :
  if n[0] == n[1] : 
    ans += n[2] - n[1]
    n[0] += n[2] - n[1]
    n[1] += n[2] - n[1]

  elif n[1] == n[2] :
    ans += (n[1] - n[0]) // 2 + (2 if (n[1] - n[0]) % 2 else 0 )
    n[2] += 1 if (n[1] - n[0]) % 2 else 0
    n[1] = n[2]
    n[0] = n[2]

  else :
    ans += n[2] - n[1]
    n[0] += n[2] - n[1]
    n[1] += n[2] - n[1]
print(ans)