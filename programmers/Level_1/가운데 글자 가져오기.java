/*
Programmers
Level 1 - Java
연습문제
가운데 글자 가져오기

https://programmers.co.kr/learn/courses/30/lessons/12903
*/

class Solution {
  public String solution(String s) {
      
      int k = s.length()/2;
      if(s.length()%2 == 0) return s.substring(k-1,k+1);
      return s.substring(k,k+1);

  }
}
