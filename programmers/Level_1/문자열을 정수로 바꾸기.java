/*
Programmers
Level 1 - Java
연습문제
문자열을 정수로 바꾸기

https://programmers.co.kr/learn/courses/30/lessons/12925
*/

class Solution {
  public int solution(String s) {
      if(s.charAt(0) == '-')
          return -Integer.parseInt(s.substring(1));
      else if(s.charAt(0) == '+')
          return Integer.parseInt(s.substring(1));
      else
          return Integer.parseInt(s);
  }
}
