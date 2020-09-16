/*
Programmers
Level 1 - Java
2018 KAKAO BLIND RECRUITMENT
[1차] 비밀지도

https://programmers.co.kr/learn/courses/30/lessons/17681
*/

class Solution {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<arr1.length; i++) {
        	arr1[i] |= arr2[i];
        	
        	answer[i] = Integer.toBinaryString(arr1[i]);
        	
        	int length = answer[i].length();
        	
        	if(answer[i].length() < n)
        		for(int j=0; j<n - length; j++)
        			answer[i] = "0" + answer[i];
        	
        	
        	answer[i] = answer[i].replace("0", " ");
        	answer[i] = answer[i].replace('1', '#');
	
        }
        
        return answer;
    }
}
