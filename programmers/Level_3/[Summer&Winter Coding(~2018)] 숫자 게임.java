/*
Programmers
Level 3 - Java
Summer/Winter Coding(~2018)
숫자 게임

https://programmers.co.kr/learn/courses/30/lessons/12987
*/

import java.util.Arrays;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        
        Arrays.sort(A); Arrays.sort(B);
        
        int a = 0, b = 0;
        
        while(b < B.length) {
        	if(A[a] < B[b]) {
        		answer++; a++;
        	}
        	
        	b++;
        }
        
        return answer;
    }
}
