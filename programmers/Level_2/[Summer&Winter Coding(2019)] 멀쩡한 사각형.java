/*
Programmers
Level 2 - Java
Summer/Winter Coding(2019)
멀쩡한 사각형

https://programmers.co.kr/learn/courses/30/lessons/62048
*/

class Solution {
    public static long solution(int w, int h) {
        long answer = 0;
        
        if(w < h) {
        	int tmp = w; w = h; h = tmp;
        }
        
        int gcd = gcd(w, h);
        
        return (long) w * h - (w + h - gcd);
    }

	
	static int gcd(int a, int b) {
		return a % b == 0 ? b : gcd(b, a % b) ;
	}
}
