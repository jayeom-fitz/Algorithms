/*
Programmers
Level 2 - Java
2018 KAKAO BLIND RECRUITMENT
[3차] 압축

https://programmers.co.kr/learn/courses/30/lessons/17684
*/

import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] solution(String msg) {
        int idx = 27;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=1; i<idx; i++) map.put((char)('A' - 1 + i) + "", i);
		
        int len = msg.length();
        String cache = "";
        for(int i=0; i<len; i++) {
        	String ch = msg.charAt(i) + "";
        	String s = cache + ch;
        	
        	if(map.containsKey(s)) {
        		cache = s;
        		
        		if(i == len - 1) 
            		list.add(map.get(cache));
        	} else if(i == len - 1) {
            	list.add(map.get(cache)); list.add(map.get(ch));
        	} else {	
        		map.put(s, idx++);	list.add(map.get(cache));	cache = ch;
        	}
        }
        
        int pos = 0;
        int[] answer = new int[list.size()];
        for(Integer i : list) answer[pos++] = i;
        return answer;
    }
}
