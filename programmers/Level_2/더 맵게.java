/*
Programmers
Level 2 - Java
힙(Heap)
더 맵게

https://programmers.co.kr/learn/courses/30/lessons/42626
*/

import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        for(int i=0; i<scoville.length; i++) pq.add(scoville[i]);
        
        while(pq.size() > 1) {
        	int min1 = pq.poll();
        	if(min1 >= K) return answer;
        	int min2 = pq.poll();
        	
        	pq.add(min1 + min2 * 2);
        	answer++;
        }
        if(pq.poll() >= K) return answer;
        
        return -1;
    }
}
