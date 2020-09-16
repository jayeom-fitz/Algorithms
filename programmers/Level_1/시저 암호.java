/*
Programmers
Level 1 - Java
연습문제
시저 암호

https://programmers.co.kr/learn/courses/30/lessons/12926
*/

class Solution {
  public String solution(String s, int n) {
      int len = s.length();
      String answer = "";
      
      for(int i=0; i<len; i++){
          char c = s.charAt(i);
          
          if(c == ' ')
              answer += " ";
          else if(c >= 'a' && c <= 'z')
              answer += (char) ((c - 'a' + n) % 26 + 'a');
          else
              answer += (char) ((c - 'A' + n) % 26 + 'A');
      }
      
      return answer;
  }
}
