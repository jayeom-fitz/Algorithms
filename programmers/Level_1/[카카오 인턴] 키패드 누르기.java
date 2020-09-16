/*
Programmers
Level 1 - Java
2020 카카오 인턴십
[카카오 인턴] 키패드 누르기

https://programmers.co.kr/learn/courses/30/lessons/67256
*/

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int lPos = 10, rPos = 12;
        int size = numbers.length;
        
        for(int i=0; i<size; i++) {
        	if(numbers[i] == 0) numbers[i] = 11;
        	
        	if(numbers[i] % 3 == 1) {
        		lPos = numbers[i]; answer += "L";
        	} else if (numbers[i] % 3 == 0) {
        		rPos = numbers[i]; answer += "R";
        	} else {
        		int lDiff = Math.abs(lPos - numbers[i]);
        		lDiff = lDiff / 3 + lDiff % 3;

        		int rDiff = Math.abs(rPos - numbers[i]);
        		rDiff = rDiff / 3 + rDiff % 3;

        		if(lDiff < rDiff || (lDiff == rDiff && hand.equals("left"))) {
        			lPos = numbers[i]; answer += "L";
        		} else {
        			rPos = numbers[i]; answer += "R";
        		}         		
        	}
        	
        }
        
        return answer;
    }
}
