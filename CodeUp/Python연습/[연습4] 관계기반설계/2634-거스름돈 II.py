"""
CodeUp
2634 : 거스름돈 II
https://www.codeup.kr/problem.php?id=2634
"""
W = int(input())
N = int(input())
c = list(map(int, input().split()))

d = [10001 for i in range(W+1)]

def func(count, charge) :
  if charge > W :
    return

  if d[charge] <= count :
    return
  
  d[charge] = count

  for i in range(N-1, -1, -1) :
    func(count+1, charge+c[i])

func(0, 0)
print(d[W])