/*
Programmers
Level 2 - Java
연습문제
Summer/Winter Coding(~2018)
점프와 순간 이동

https://programmers.co.kr/learn/courses/30/lessons/12980
*/

import java.util.*;

public class Solution {
    public static int solution(int n) {
		int ans = 0;

		while(n != 0) {
        	if(n % 2 != 0) {
        		n -= 1;
        		ans++;
        	}
        	else 
        		n /= 2;
        }
		
		return ans;
    }
}
