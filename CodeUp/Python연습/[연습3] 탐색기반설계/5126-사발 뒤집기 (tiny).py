"""
CodeUp
5126 : 사발 뒤집기 (tiny)
https://www.codeup.kr/problem.php?id=5126
"""
n = list(map(int, input().split()))
d = [-1 for i in range(2**8)]

c = [
  0b11000000,
  0b11100000,
  0b01110000,
  0b00111000,
  0b00011100,
  0b00001110,
  0b00000111,
  0b00000011
]

a = 0
for i in n :
  a <<= 1
  a += i

def func(k, s) :
  if s == 0 :
    d[0] = k
    return

  if (d[0] != -1 and d[0] <= k) or (d[s] != -1 and d[s] <= k) :
    return

  d[s] = k

  for i in range(8) :
    v1 = (~s & 0b11111111) & c[i]
    v2 = s & c[i]
    func(k+1, s + v1 - v2)  

func(0, a)

print(d[0])
