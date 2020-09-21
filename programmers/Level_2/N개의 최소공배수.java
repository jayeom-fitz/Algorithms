/*
Programmers
Level 2 - Java
연습문제
N개의 최소공배수

https://programmers.co.kr/learn/courses/30/lessons/12953
*/

import java.util.Arrays;

class Solution {
    public static int solution(int[] arr) {

        Arrays.sort(arr);
        
        for(int i=arr.length - 2; i >= 0; i--) {
        	arr[i] = arr[i+1] * arr[i] / gcd(arr[i+1], arr[i]);
        }
        
        return arr[0];
    }
	
	public static int gcd(int a, int b) {
		return a % b == 0 ? b : gcd(b, a%b);
	}
}
