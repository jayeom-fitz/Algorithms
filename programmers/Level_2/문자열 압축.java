/*
Programmers
Level 2 - Java
2020 KAKAO BLIND RECRUITMENT
문자열 압축

https://programmers.co.kr/learn/courses/30/lessons/60057
*/

public class Solution {
    public static int solution(String s) {
		int answer = s.length();
		
		int size = answer;
		
		for(int i=1; i<=size/2; i++) {
			
			int length = size;
			
			int count = 1;
			
			for(int j=0; j<size-i; j+=i) {

				if(size < j+i+i) break;
				
				if(s.substring(j,j+i).equals(s.substring(j+i, j+i+i))) {
					count++;
					length -= i;
				} else if(count != 1) {
					length += Math.log10(count)/1 +1;
					count = 1;
				}
				
			}
			
            if(count != 1) {
					length += Math.log10(count)/1 + 1;
					count = 1;
				}
            
			answer = answer < length ? answer : length;
			
		}
		
		return answer;
	}
}
