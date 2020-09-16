/*
Programmers
Level 2 - Java
스택/큐
주식가격

https://programmers.co.kr/learn/courses/30/lessons/42584
*/

class Solution {
  public static int[] solution(int[] prices) {
        int len = prices.length;
		    int[] answer = new int[len];
        int[] pointer = new int[len];
           
        answer[len-1] = 0;
        pointer[len-1] = len;
        
        for(int i=len-2; i>=0; i--) {
        	int idx = i+1;
        	
        	answer[i] = 1;
        	pointer[i] = idx;
        	
        	while(idx <= len) {
        		
        		if(idx == len) {
        			pointer[i] = idx; break;
        		}
        		
        		if(prices[i] <= prices[idx]) {
        			answer[i] += answer[idx];
					idx = pointer[i] = pointer[idx];			
        		}else {
        			break;
        		}
        	}
        }
        
        return answer;
    }
}
