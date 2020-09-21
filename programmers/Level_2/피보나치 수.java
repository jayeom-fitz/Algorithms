/*
Programmers
Level 2 - Java
연습문제
피보나치 수

https://programmers.co.kr/learn/courses/30/lessons/12945
*/

class Solution {
    public static int solution(int n) {
		int answer = 0;
		int a = 1, b = 0;
		
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		for(int i=2; i<=n; i++) {
			answer = (a + b) % 1234567;
			b = a; a = answer;
		}
		
		return answer;
	}
}
