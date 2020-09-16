/*
Programmers
Level 2 - Java
스택/큐
프린터

https://programmers.co.kr/learn/courses/30/lessons/42587
*/

import java.util.LinkedList;

class Solution {
    class pos{
		boolean check;
		int prioritiy;
		
		public pos(boolean check, int prioritiy) {
			this.check = check;
			this.prioritiy = prioritiy;
		}		
	}
	
	public int solution(int[] priorities, int location) {
        int answer = 0;
        int len = priorities.length;
        LinkedList<pos> p = new LinkedList<pos>();
        
        for(int i=0; i<priorities.length; i++)
        	p.add(new pos(i==location, priorities[i]));
        
        while(!p.isEmpty()) {
        	int max = p.getFirst().prioritiy;
        	
        	for(int i=1; i<len; i++) {
        		int value = p.get(i).prioritiy;
        		max = max > value ? max : value; 
        	}
        	
        	if(max == p.getFirst().prioritiy) {
        		answer++;
        		
        		if(p.getFirst().check)
        			break;
        		
        		len--;
        	}else {
        		p.add(p.getFirst());
        	}
        	
        	p.removeFirst();
        }
        
        return answer;
    }
}
