/*
Programmers
Level 1 - Java
연습문제
두 정수 사이의 합

https://programmers.co.kr/learn/courses/30/lessons/12912
*/

class Solution {
  public long solution(int a, int b) {
      if(a == b) return a;
      
      if(a > b){
          int t = a;
          a = b;
          b = t;
      }
      
      long A = a, B = b;
      long answer = (B - A) * (B + A + 1) / 2;
      return answer;
  }
}
