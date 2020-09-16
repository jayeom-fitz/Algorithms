/*
Programmers
Level 1 - Java
연습문제
정수 제곱근 판별

https://programmers.co.kr/learn/courses/30/lessons/12934
*/

class Solution {
    public long solution(long n) {
        long left = 1, right = 10000000;
        long mid;
		
        while(left <= right) {
        	mid = (left + right) / 2;
        	
        	if(mid * mid == n) 
        		return (mid + 1L) * (mid + 1L);
        	
        	if(mid * mid < n) 
        		left = mid + 1;
        	else
        		right = mid - 1;
        }
        
        return -1;
    }
}
