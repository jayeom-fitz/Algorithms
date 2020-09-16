/*
Programmers
Level 1 - Java
2018 KAKAO BLIND RECRUITMENT
[1차] 다트 게임

https://programmers.co.kr/learn/courses/30/lessons/17682
*/

class Solution {
    public static int solution(String dartResult) {
		int[] score = new int[3];
		int idx = 0;
		boolean flag = false;
		
		for(int i=0; i<dartResult.length(); i++) {
			char ch = dartResult.charAt(i);
			
			if(ch >= '0' && ch <= '9') {
				if(flag) {
					idx++;	flag = false;
				}

				score[idx] = score[idx] * 10 + (ch - '0');
				
			}else if(ch >= 'A') {
				flag = true;
				
				switch(ch) {
				case 'S' :
					break;
				case 'D' :
					score[idx] *= score[idx]; 
					break;
				case 'T' :
					score[idx] *= score[idx] * score[idx]; 
					break;	
				}
				
			}else {
				flag = true;
				
				switch(ch) {
				case '*' :
					if(idx != 0)
						score[idx - 1] *= 2;
					score[idx] *= 2;
					break;
				case '#' :
					score[idx] *= -1; 
					break;	
				}
			}
		}
        return score[0] + score[1] + score[2];
    }
}
