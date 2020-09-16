/*
Programmers
Level 2 - Java
Summer/Winter Coding(~2018)
스킬트리

https://programmers.co.kr/learn/courses/30/lessons/49993
*/

class Solution {
   int len;
	
	public int solution(String skill, String[] skill_trees) {
        int answer = 0;        
        len = skill.length();
        
        for(String str : skill_trees)       	
        	if(find(skill, str))
        		answer++;
        
        return answer;
    }

	private boolean find(String skill, String str) {		
		int[] idx = new int[len];
		
		int count = 0;
		
		for(int i=0; i<len; i++) {
			idx[i] = str.indexOf(skill.charAt(i));
			
			if(idx[i] != -1)
				count++;
		}
		
		if(count == 0)
			return true;

		for(int i=1; i<len; i++) {
			
			if(idx[i] == -1)
				continue;
			
			for(int j=i-1; j>=0; j--) {
				
				if(idx[j] == -1 || idx[j] > idx[i])
					return false;
				
			}
		}
		
		return true;
	}
}
