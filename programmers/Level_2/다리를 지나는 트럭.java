/*
Programmers
Level 2 - Java
스택/
다리를 지나는 트럭

https://programmers.co.kr/learn/courses/30/lessons/42583
*/

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int count = 0;
        
        int idx = 0, w = 0;
        Truck t = null;
        
        Queue<Truck> move = new LinkedList<Truck>();
        
        while(!(move.isEmpty() && idx == truck_weights.length)) {
        	count++;
        	
        	if(!move.isEmpty() && move.peek().distance == 0) {
        		w -= move.poll().weight;
        	}
        	
        	if(idx < truck_weights.length && w + truck_weights[idx] <= weight) {
        		w += truck_weights[idx];
        		move.add(new Truck(truck_weights[idx++], bridge_length));
        	}
        	
        	Iterator<Truck> iter = move.iterator();
        	while(iter.hasNext()) {
        		t = iter.next(); t.distance--;
        	}
        	
        }
        
        return count;
    }
}

class Truck {
	int weight, distance;
	public Truck(int w, int d) {
		weight = w;
		distance = d;
	}
}
