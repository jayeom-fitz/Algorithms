"""
CodeUp
1754 : 큰 수 비교
https://www.codeup.kr/problem.php?id=1754
"""
def swap(n1, n2):
  return [n2, n1]

def comp1(n1, n2):
  if len(n1) > len(n2) :
    return True
  elif len(n1) < len(n2) :
    return False
  else :
    for i in range(len(n1)) :
      if ord(n1[i]) - ord(n2[i]) == 0 :
        continue
      elif ord(n1[i]) - ord(n2[i]) > 0 :
        return True
      else :
        return False

def comp2(n1, n2):
  if n1[0] == '-' and n2[0] != '-' :
    return False
  elif n1[0] != '-' and n2[0] == '-' :
    return True
  elif n1[0] == '-' and n2[0] == '-' :
    return not comp1(n1[1:], n2[1:])
  else :
    return comp1(n1, n2)
  
  

n1, n2 = input().split()

if comp2(n1, n2) :
  n = swap(n1, n2)
  n1 = n[0]
  n2 = n[1]

print(n1, n2)