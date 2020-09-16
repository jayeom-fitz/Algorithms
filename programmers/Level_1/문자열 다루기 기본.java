/*
Programmers
Level 1 - Java
연습문제
문자열 다루기 기본

https://programmers.co.kr/learn/courses/30/lessons/12918
*/

class Solution {
  public boolean solution(String s) {
      int length = s.length();
      if(!(length == 4 || length == 6))
          return false;
      
      for(int i=0; i<length; i++){
          char c = s.charAt(i);
          if(c < '0' || c > '9')
              return false;
      }
      return true;
  }
}
