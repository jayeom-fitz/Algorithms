"""
CodeUp
3170 : 기억력 테스트 9
https://www.codeup.kr/problem.php?id=3170
"""
import sys

n, m = map(int,input().split())
d = {}

for i in range(n) :
  a, u = sys.stdin.readline().split()
  d[a] = d.get(a,0)+int(u)

for i in range(m) :
  a = sys.stdin.readline()
  print(d.get(a.rstrip('\n'),0))