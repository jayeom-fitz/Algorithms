/*
Programmers
Level 2 - Java
연습문제
JadenCase 문자열 만들기

https://programmers.co.kr/learn/courses/30/lessons/12951
*/

class Solution {
    public static String solution(String s) {
        String answer = "";
		int idx = 0, len = s.length();
        
        if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z')
        	answer += (char)(s.charAt(idx++) - 'a' + 'A');
        else if(s.charAt(0) >= 'A' && s.charAt(0) <= 'Z')
        	answer += s.charAt(idx++);
        
        answer += s.charAt(idx) >= 'A' && s.charAt(idx) <= 'Z' ?
        		 (char)(s.charAt(idx++) - 'A' + 'a') : s.charAt(idx++);
        
        for(int i=idx; i<len; i++) {
        	if(s.charAt(i-1) == ' ')
        		answer += s.charAt(i) >= 'a' && s.charAt(i) <= 'z' ?
        			(char)(s.charAt(i) - 'a' + 'A') : s.charAt(i);
        	else {
        		answer += s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' ?
               		 (char)(s.charAt(i) - 'A' + 'a') : s.charAt(i);
        	}
        }
		
        return answer;
    }
}
