/*
Programmers
Level 3 - Java
2018 KAKAO BLIND RECRUITMENT
[1차] 셔틀버스

https://programmers.co.kr/learn/courses/30/lessons/17678
*/

import java.util.Arrays;
import java.util.LinkedList;

class Solution {
    public String solution(int n, int t, int m, String[] timetable) {
		int lastBusTime = 9 * 60 + (n - 1) * t;

		int[] time = new int[timetable.length];
		for(int i=0; i<timetable.length; i++) 
			time[i] = timeStringToInt(timetable[i]);
		Arrays.sort(time);

		LinkedList<Integer> q = new LinkedList<Integer>();
		for(int i : time)	q.add(i);

		int last = 0, busTime = 60 * 9;
		int seat = m, times = 1;
		while(!q.isEmpty()) {
			int person = q.peek();
			if(person <= busTime) {
				seat--; q.poll(); last = person;
			} else {
				if(times == n) break;
				seat = m; busTime += t; times++; continue;
			}

			if(seat == 0) {
				if(times == n) break;
				seat = m; busTime += t; times++;
			}
		}
		
		int answer = 0;

		if(seat != 0) answer = lastBusTime;
		else answer = last - 1;

		return timeIntToString(answer);
	}

	public int timeStringToInt(String time) {
		String[] s = time.split(":");
		return Integer.parseInt(s[0]) * 60 + Integer.parseInt(s[1]);
	}

	public String timeIntToString(int time) {
		String ret = "";
		ret += time / 60 < 10 ? "0" + time / 60 : time / 60;
		ret += ":";
		ret += time % 60 < 10 ? "0" + time % 60 : time % 60;
		return ret;
	}
}
