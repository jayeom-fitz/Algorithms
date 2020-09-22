/*
Programmers
Level 2 - Java
2018 KAKAO BLIND RECRUITMENT
[1차] 뉴스 클러스터링

https://programmers.co.kr/learn/courses/30/lessons/17677
*/

import java.util.ArrayList;

class Solution {
    public static int solution(String str1, String str2) {
        int answer = 0;
        int v = 65536;
        
        str1 = str1.toUpperCase(); str2 = str2.toUpperCase();
        
        int len1 = str1.length(), len2 = str2.length();
        
        ArrayList<String> s1 = new ArrayList<String>();
        ArrayList<String> s2 = new ArrayList<String>();
        
        for(int i=0; i<len1 - 1; i++) {
        	char c1 = str1.charAt(i), c2 = str1.charAt(i+1);
        	
        	if( ((c1 >= 'A' && c1 <= 'Z') && (c2 >= 'A' && c2 <= 'Z')) ) 
        		s1.add(c1 + "" + c2);
        }
        
        for(int i=0; i<len2 - 1; i++) {
        	char c1 = str2.charAt(i), c2 = str2.charAt(i+1);
        	
        	if( ((c1 >= 'A' && c1 <= 'Z') && (c2 >= 'A' && c2 <= 'Z')) ) 
        		s2.add(c1 + "" + c2);
        }
        
        if(s1.size() == 0 && s2.size() == 0) {
        	answer = v;
        } else if(s1.size() == 0 || s2.size() == 0) {
        	answer = 0;
        } else {
        	double kyo = 0, hap = 0;
        	
        	while(!(s1.isEmpty() || s2.isEmpty())) {
        		if(s2.contains(s1.get(0))) {
        			s2.remove(s2.indexOf(s1.get(0))); kyo++;
        		} 
        		hap++;	s1.remove(0);
        	}
        	
        	if(s1.isEmpty()) {
        		hap += s2.size();
        	} else {
        		hap += s1.size();
        	}
        	
        	answer = (int) ( kyo / hap * v );
        }
        
        return answer;
    }
}
