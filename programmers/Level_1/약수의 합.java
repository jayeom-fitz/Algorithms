/*
Programmers
Level 1 - Java
연습문제
약수의 합

https://programmers.co.kr/learn/courses/30/lessons/12928
*/

class Solution {
  public int solution(int n) {
      int answer = 0;
      for(int i=1; i*i<=n; i++){
          if(n % i == 0){
              if(n / i == i)
                  answer += i;
              else
                  answer += i + n / i;
          }
      }
      return answer;
  }
}
