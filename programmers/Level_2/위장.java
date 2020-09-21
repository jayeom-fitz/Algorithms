/*
Programmers
Level 2 - Java
연습문제
해시
위장

https://programmers.co.kr/learn/courses/30/lessons/42578
*/

import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        
        for(int i=0; i<clothes.length; i++) {
        	if(hash.containsKey(clothes[i][1])) {
        		hash.put(clothes[i][1], hash.get(clothes[i][1]) + 1);
        	} else {
        		hash.put(clothes[i][1], 1);
        	}
        }
        
        for(String key : hash.keySet()) {
        	answer *= hash.get(key) + 1;
        }
        
        return answer - 1;
    }
}
