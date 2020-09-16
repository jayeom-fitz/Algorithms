/*
Programmers
Level 1 - Java
연습문제
문자열 내림차순으로 배치하기

https://programmers.co.kr/learn/courses/30/lessons/12917
*/

class Solution {
  public String solution(String s) {
      int[] alpBig = new int[26];
      int[] alpSma = new int[26];
      
      int len = s.length();
      for(int i=0; i<len; i++){
          char c = s.charAt(i);
          if(c >= 'a')
              alpSma[c - 'a']++;
          else
              alpBig[c - 'A']++;
      }
      
      String answer = "";
      for(int i=25; i>=0; i--){
          while(alpSma[i]-- != 0){
              answer += (char)(i+'a');
          }
      }
      
      for(int i=25; i>=0; i--){
          while(alpBig[i]-- != 0){
              answer += (char)(i+'A');
          }
      }
      
      return answer;
  }
}
