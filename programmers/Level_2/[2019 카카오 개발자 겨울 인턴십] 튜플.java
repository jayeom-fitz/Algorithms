/*
Programmers
Level 2 - Java
2019 카카오 개발자 겨울 인턴십
튜플

https://programmers.co.kr/learn/courses/30/lessons/64065
*/

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        
        String[] sp = s.substring(2, s.length()-2).split("\\},\\{");
        
        Arrays.sort(sp, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() < o2.length() ? -1 : 1;
			}
		});
        
        answer = new int[sp.length];
        answer[0] = Integer.parseInt(sp[0]);
        
        for(int i=1; i<answer.length; i++) {
        	String[] str = sp[i].split(",");
        	
        	for(int j=0; j<str.length; j++) {
        		boolean flag = true;
        		
        		for(int k=0; k<i; k++) {
        			if(str[j].equals(answer[k]+"")) {
        				flag = false; break;
        			}
        		}
        		
        		if(flag) {
        			answer[i] = Integer.parseInt(str[j]); break;
        		}
        	}
        }
        
        return answer;
    }
}
