/*
Programmers
Level 2 - Java
2018 KAKAO BLIND RECRUITMENT
[1차] 캐시

https://programmers.co.kr/learn/courses/30/lessons/17680
*/

import java.util.ArrayList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        if(cacheSize == 0)
            return 5 * cities.length;
        
        int length = 0;
        ArrayList<String> array = new ArrayList<String>();
        
        for(int i=0; i<cities.length; i++) {
            cities[i] = cities[i].toUpperCase();
            
        	if(array.contains(cities[i])) {
    			array.remove(array.indexOf(cities[i])); answer++;
    		} else if(length < cacheSize) {
    			length++; answer += 5;
    		} else {
    			array.remove(0); answer += 5;
    		}
        	
        	array.add(cities[i]);
        }
        
        return answer;
    }
}
