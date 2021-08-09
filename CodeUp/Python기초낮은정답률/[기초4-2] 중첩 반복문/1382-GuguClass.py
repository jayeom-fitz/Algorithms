"""
CodeUp
1382 : GuguClass
https://www.codeup.kr/problem.php?id=1382
"""
for i in range(1, 10) :
  for j in range(2, 6) :
    print(j, 'x', i, '=', '%2d'%(i*j), end='')
    if j == 5 :
      print()
    else :
      print(end='\t')