/*
Programmers
Level 1 - Java
연습문제
서울에서 김서방 찾기

https://programmers.co.kr/learn/courses/30/lessons/12919
*/

class Solution {
  public String solution(String[] seoul) {
      int idx = 0;
      
      for(int i=0; i<seoul.length; i++){
          if(seoul[i].equals("Kim")){
              idx = i; break;
          }
      }
      
       String answer = "김서방은 "+idx+"에 있다";
      return answer;
  }
}
