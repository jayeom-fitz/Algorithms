"""
CodeUp
4701 : 두 용액
https://www.codeup.kr/problem.php?id=4701
"""
N = int(input())
d = list(map(int, input().split()))
d.sort()

left = 0
right = N-1
answer = [0, 0]
max = 2100000000
while left < right :
  if abs(d[left] + d[right]) < max :
    max = abs(d[left] + d[right])
    answer = [d[left], d[right]]

  if abs(d[left+1] + d[right]) < abs(d[left] + d[right-1]) :
    left += 1
  else :
    right -= 1

print(answer[0], answer[1]) 