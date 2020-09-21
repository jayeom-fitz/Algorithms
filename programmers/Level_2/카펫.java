/*
Programmers
Level 2 - Java
완전탐색
카펫

https://programmers.co.kr/learn/courses/30/lessons/42842
*/

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for(int i=1; ; i++) {
        	if(yellow % i != 0) continue;
        	
        	int height = yellow / i;
        	
        	if((i + 2) * (height + 2) == yellow + brown) {
        		if(i < height) {
        			answer[0] = height; answer[1] = i;
        		} else {
        			answer[0] = i; answer[1] = height;
        		} break;
        	}
        }
        
        answer[0] += 2; answer[1] += 2;
        
        return answer;
    }
}
