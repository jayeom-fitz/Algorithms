/*
Programmers
Level 1 - Java
탐욕법(Greedy)
체육복

https://programmers.co.kr/learn/courses/30/lessons/42862
*/

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        boolean[] hasUniform = new boolean[n+2];
        for(int i=0; i<reserve.length; i++) {
        	hasUniform[reserve[i]] = true;
        }
        
        for(int i=0; i<lost.length; i++) {
        	if(hasUniform[lost[i]]) {
        		hasUniform[lost[i]] = false; answer++;
                lost[i] = 0;
        	}
        }
        
        for(int i=0; i<lost.length; i++) {
        	if(lost[i] == 0)
        		continue;
        	
        	if(hasUniform[lost[i] - 1]) {
        		hasUniform[lost[i] - 1] = false; answer++;
        	}
        	else if(hasUniform[lost[i] + 1]) {
        		hasUniform[lost[i] + 1] = false; answer++;
        	}
        }
        
        return answer;
    }
}
