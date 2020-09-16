/*
Programmers
Level 1 - Java
연습문제
하샤드 수

https://programmers.co.kr/learn/courses/30/lessons/12947
*/

class Solution {
    public static boolean solution(int x) {
        return x % sum(x) == 0;
    }
	
	public static int sum(int n) {
		int result = 0;
		while(n != 0 ) {
			result += n % 10; n /= 10;
		}
		return result;
	}
}
