/*
Programmers
Level 1 - Java
연습문제
수박수박수박수박수박수?

https://programmers.co.kr/learn/courses/30/lessons/12922
*/

class Solution {
  public String solution(int n) {
      String answer = "";
      
      while(n >= 2){
        answer += "수박"; n -= 2;    
      }
      
      if(n == 1)
          answer += "수";
      
      return answer;
  }
}
