/*
Programmers
Level 2 - Java
연습문제
숫자의 표현

https://programmers.co.kr/learn/courses/30/lessons/12924
*/

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int left = 1, right = 1, sum = 1;
        
        while(left <= n) {
        	if(sum == n) {
        		answer++; 
        		sum -= left++; sum += ++right;
        	}else if(sum > n) {
        		sum -= left++;
        	}else {
        		sum += ++right;
        	}
        }
        
        return answer;
    }
}
