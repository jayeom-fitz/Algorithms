/*
Programmers
Level 1 - Java
연습문제
문자열 내 마음대로 정렬하기

https://programmers.co.kr/learn/courses/30/lessons/12915
*/

class Solution {
    public String[] solution(String[] strings, int n) {
        for(int i = strings.length - 1; i>0; i--) {
        	for(int j=1; j<=i; j++) {
        		
        		if(strings[j - 1].charAt(n) > strings[j].charAt(n)) 
        			swap(strings, j-1, j);
        		
        		else if(strings[j - 1].charAt(n) == strings[j].charAt(n)) {
        			if(strings[j - 1].compareTo(strings[j]) > 0)
        				swap(strings, j-1, j);
        		}
        	}
        }
		
        return strings;
    }
    
    public void swap(String[] strings, int i, int j) {
		String temp = strings[i];
		strings[i] = strings[j];
		strings[j] = temp;
	}
}
