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
        int answer = 0;
        
        int length = name.length();
        
        int A = 0;
        int min = 0;
        
        for(int i=length-1; i>=0; i--) {
        	A *= 2;
        	if(name.charAt(i) != 'A') A++;
        }
        
        if(A % 2 == 1) {
        	min = countChangeChar('A', name.charAt(0));
        	A--;
        }
        
        PriorityQueue<Move> pq = new PriorityQueue<Move>();
        pq.add(new Move(min, 0, A));
        
        while(!pq.isEmpty()) {
        	Move m = pq.poll();
        	
        	if(m.a == 0) {
        		return m.count;
        	}
        	
        	Move m1 = new Move(m.count, m.cursor, m.a);
        	Move m2 = new Move(m.count, m.cursor, m.a);
        	
        	pq.add(movement(1, length, m1, name));
        	pq.add(movement(-1, length, m2, name));
        }
        
        return answer;
    }
	
	static int countChangeChar(char c1, char c2) {
		return Math.min(Math.abs(c1-c2), 26 - Math.abs(c1-c2));
	}
	
	static Move movement(int dir, int length, Move m, String s) {
		for(int i=1; ; i++) {
			m.cursor += dir;
			
			if(m.cursor < 0) m.cursor = length - 1;
			else if(m.cursor >= length) m.cursor = 0;
			
			if((m.a >> m.cursor) % 2 == 1) {
				m.a -= Math.pow(2, m.cursor);
				m.count += i + countChangeChar('A', s.charAt(m.cursor));
				break;
			}
		}
		
		return m;
	}
	
	static class Move implements Comparable<Move> {
		int count;
		int cursor;
		int a;
		
		Move(int count, int cursor, int a) {
			this.count = count;
			this.cursor = cursor;
			this.a = a;
		}

		@Override
		public int compareTo(Move o) {
			if (this.count > o.count) return 1;
	        else if (this.count < o.count) return -1;
	        return 0;
		}
	}
}

