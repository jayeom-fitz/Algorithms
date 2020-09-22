/*
Programmers
Level 2 - Java
2019 KAKAO BLIND RECRUITMENT
후보키

https://programmers.co.kr/learn/courses/30/lessons/42890
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class Solution {
    public int solution(String[][] relation) {
        
        ArrayList<Integer> array = new ArrayList<Integer>();
        
        for(int i=0; i<relation[0].length; i++) 
        	dfs(relation, 1 << i, array);
        
        Collections.sort(array);
        
        for(int i=0; i<array.size()-1; i++) 
        	for(int j=i+1; j<array.size(); j++) 
        		if(array.get(i) == (array.get(i) & array.get(j)) ) 
        			array.remove(j--);
        
        return array.size();
    }
	
	public void dfs(String[][] s, int check, ArrayList<Integer> array) {
		int size = array.size();
		for(int i=0; i<size; i++) {
			if(array.get(i) == (array.get(i) & check))
				return;
		}
		
		boolean flag = false;
		HashSet<String> set = new HashSet<String>();
		
		for(int i=0; i<s.length; i++) {
			String str = "";
			for(int j=0; j<s[0].length; j++) {
				if((check >> j) % 2 == 1) 
					str += s[i][j] + ",";
			}
            
			if(set.contains(str)) {
				flag = true; break;
			} else 
				set.add(str);
		}
        
		set.clear();
		
		if(flag) {
			for(int i=0; i<s[0].length; i++) 
				if((check >> i) % 2 != 1) 
					dfs(s, check | (1 << i), array);
			return;
		}
		
		array.add(check);
	}
}
