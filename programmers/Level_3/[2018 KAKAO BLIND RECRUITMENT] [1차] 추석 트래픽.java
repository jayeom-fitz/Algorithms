/*
Programmers
Level 3 - Java
2018 KAKAO BLIND RECRUITMENT
[1차] 추석 트래픽

https://programmers.co.kr/learn/courses/30/lessons/17676
*/

import java.util.ArrayList;

class Solution {
    public int solution(String[] lines) {
        int answer = 0;
        
        ArrayList<Traffic> list = new ArrayList<Solution.Traffic>();
        
        for(int i=0; i<lines.length; i++) {
        	String[] t = lines[i].split(" ");
        	String[] time = t[1].split(":");
        	
        	int hour = Integer.parseInt(time[0]);
        	int minute = Integer.parseInt(time[1]);
        	double second = Double.parseDouble(time[2]);
        	double period = Double.parseDouble(t[2].substring(0, t[2].length() - 1)) - 0.001;
        	
        	list.add(new Traffic(hour, minute, second, period));
        }
        
        
        for(int i=0; i<lines.length; i++) {
        	int value = 1;
        	Traffic d = list.get(i);

        	for(int j=i+1; j<lines.length; j++) {
        		Traffic t = list.get(j);

        		if(t.start < d.end + 1)
        			value++;
        	}
        	
        	answer = Math.max(answer, value);
        }
        
        return answer;
    }
	
	class Traffic {
		double start, end;
		
		public Traffic(int hour, int minute, double second, double period) {
			this.end = (hour * 60 + minute) * 60 + second; 
			this.start = end - period;
		}
	}
}
