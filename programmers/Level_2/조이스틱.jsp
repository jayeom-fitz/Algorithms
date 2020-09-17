/*
Programmers
Level 2 - Java
탐욕법(Greedy)
조이스틱

https://programmers.co.kr/learn/courses/30/lessons/42860
*/

import java.util.PriorityQueue;

class Solution {
    public static int solution(String name) {
        int answer = -1;
        
        int length = name.length();
        
        String s = "";
        
        for(int i=0; i<length; i++) {
        	answer += 1 + countChangeChar('A', name.charAt(i));
        	s += "A";
        }
        
        System.out.println(answer);
        
        PriorityQueue<Move> pq = new PriorityQueue<Move>();
        pq.add(new Move(0, 0, s));
        
        while(!pq.isEmpty()) {
        	Move m = pq.poll();
        	
        	if(m.count > answer) continue;
        	if(m.str.equals(name)) {
        		return m.count;
        	}
        	
        	for(int i=0; i<length; i++) {
        		if(name.charAt(i) != m.str.charAt(i)) {
        			
        			int count = m.count + countChangeChar(name.charAt(i), m.str.charAt(i)) + countCursor(m.cursor, i, length);
        			
        			if(count > answer) continue;
        			
        			pq.add(new Move(count, i, replaceChar(m.str, i, name.charAt(i))));
        		}
        	}
        }
        
        return answer;
    }
	
	static int countCursor(int p1, int p2, int length) {
		return Math.min(Math.abs(p1-p2), length - Math.abs(p1-p2));
	}
	
	static int countChangeChar(char c1, char c2) {
		return Math.min(Math.abs(c1-c2), 26 - Math.abs(c1-c2));
	}
	
	static String replaceChar(String str, int pos, char ch) {
		if(pos == 0) {
			str = ch + str.substring(1);
		} else if(pos == str.length()-1) {
			str = str.substring(0, str.length()-1) + ch;
		} else {
			str = str.substring(0, pos) + ch + str.substring(pos+1);
		}
		
		return str;
	}
	
	static class Move implements Comparable<Move> {
		int count;
		int cursor;
		String str;
		
		Move(int count, int cursor, String str) {
			this.count = count;
			this.cursor = cursor;
			this.str = str;
		}

		@Override
		public int compareTo(Move o) {
			if (this.count > o.count) return 1;
	        else if (this.count < o.count) return -1;
	        return 0;
		}
	}
}

