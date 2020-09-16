/*
Programmers
Level 1 - Java
연습문제
소수 찾기

https://programmers.co.kr/learn/courses/30/lessons/12921
*/

class Solution {
  public int solution(int n) {
      int answer = 0;
      boolean[] prime = new boolean[n+1];
      
      for(int i=2; i<=n; i++){
          if(!prime[i]){
              answer++;
              for(int j=i*2; j<=n; j+=i)
                  prime[j] = true;
          }
      }
      
      return answer;
  }
}
