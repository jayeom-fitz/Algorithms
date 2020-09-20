/*
Programmers
Level 2 - Java
탐욕법(Greedy)
큰 수 만들기

https://programmers.co.kr/learn/courses/30/lessons/42883
*/

class Solution {
    public String solution(String number, int k) {
        String answer = "";
        
        int length = number.length();
        
        int left = 0, idx = 0, minus = 0;
        
        while(true) {
        	int max = -1;
        	
        	for(int i=0; i<=k; i++ ) {
        		int value = number.charAt(left + i) - '0';
        		if(max < value) {
        			idx = left + i;
        			max = value;
        			minus = i;
        			if(value == 9) break;
        		}
        	}
        	
        	left = idx + 1;
        	k -= minus;
        	answer += number.charAt(idx);
        	
        	if(k == 0) {
        		if(left < length) answer += number.substring(left);
        		break;
        	} else if(k == length - left)
        		break;
        }
        
        return answer;
    }
}
