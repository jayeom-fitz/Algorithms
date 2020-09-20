/*
Programmers
Level 2 - Java
정렬
가장 큰 수

https://programmers.co.kr/learn/courses/30/lessons/42746
*/

import java.util.PriorityQueue;

class Solution {
   public static String solution(int[] numbers) {
        String answer = "";
        
        PriorityQueue<Num> pq = new PriorityQueue<Num>();
        
        boolean flag = true;
        
        for(int i=0; i<numbers.length; i++) {
        	pq.add(new Num(numbers[i]));
        	if(numbers[i] != 0) flag = false;
        }
        
        if(flag) return "0";
        
        while(!pq.isEmpty()) {
        	Num n = pq.poll();
        	answer += n.num;
        }

        return answer;
    }
	
	static class Num implements Comparable<Num> {
		int num;
				
		public Num(int num) {
			this.num = num;
		}

		@Override
		public int compareTo(Num o) {
			int n1 = this.num * (int) Math.pow(10, (int) Math.log10(o.num != 0 ? o.num : 1) + 1) + o.num;
			int n2 = this.num + o.num * (int) Math.pow(10, (int) Math.log10(this.num != 0 ? this.num : 1) + 1);
			
			return n1 < n2 ? 1 : -1;
		}
	}
}
