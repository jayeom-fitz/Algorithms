/*
Programmers
Level 2 - Java
연습문제
정렬
H-Index

https://programmers.co.kr/learn/courses/30/lessons/42747
*/

import java.util.Arrays;

class Solution {
    public static int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        
        for(int i=1; i<=citations[citations.length-1]; i++) {
        	int count = 0;
        	
        	for(int j=0; j<citations.length; j++) {
        		if(i <= citations[j]) {
        			count = citations.length - j; break;
        		} 
        	}
        	
        	if(i <= count) {
        		answer = i;
        	} else break;
        }
        
        return answer;
    }
}
