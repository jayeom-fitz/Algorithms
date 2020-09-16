/*
Programmers
Level 2 - Java
연습문제
124 나라의 숫자

https://programmers.co.kr/learn/courses/30/lessons/12899
*/

class Solution {
    public static String solution(int n) {
        String answer = "";
        answer = nation124(answer, n - 1, 1, 3);      
        answer = answer.replace("3", "4");
        
        return answer;
    }

	public static String nation124(String ans, int n, int min, int max) {
		if(n >= max) {
			ans = nation124(ans, n-max, min*3, max*3);	n %= max;	
		}
		
		for(int i=1; i<=3; i++)
			if(min * i > n) {
				ans += i;
				return ans;
			}
		
		return ans;
	}
}
