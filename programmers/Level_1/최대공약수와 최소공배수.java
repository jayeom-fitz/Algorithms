/*
Programmers
Level 1 - Java
연습문제
최대공약수와 최소공배수

https://programmers.co.kr/learn/courses/30/lessons/12940
*/

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        if(n < m) {
        	int tmp = n;
        	n = m;	m = tmp;
        }
        
        answer[0] = gcd(n, m);
        answer[1] = n * m / answer[0];
        
        return answer;
    }
    
    public int gcd(int n, int m) {
		return n % m == 0 ? m : gcd(m, n%m);
	}
}
