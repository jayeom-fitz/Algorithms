/*
Programmers
Level 2 - Java
연습문제
올바른 괄호

https://programmers.co.kr/learn/courses/30/lessons/12909
*/

class Solution {
    static boolean solution(String s) {
        boolean answer = true;
        
        int len = s.length();
        int count = 0;
        
        for(int i=0; i<len; i++) {
        	char c = s.charAt(i);
        	
        	count = c == '(' ? count+1 : count-1;
        	
        	if(count < 0) return false;
        }

        return count == 0;
    }
}
