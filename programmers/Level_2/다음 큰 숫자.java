/*
Programmers
Level 2 - Java
연습문제
다음 큰 숫자

https://programmers.co.kr/learn/courses/30/lessons/12911
*/

class Solution {
    public static int solution(int n) {
		int bitCount = Integer.bitCount(n);
		int answer = n;
		while(Integer.bitCount(++answer)!=bitCount);
		return answer;
	}
}
