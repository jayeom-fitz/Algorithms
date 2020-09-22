/*
Programmers
Level 2 - Java
2019 KAKAO BLIND RECRUITMENT
오픈채팅방

https://programmers.co.kr/learn/courses/30/lessons/42888
*/

import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<String, String>();
		ArrayList<result> list = new ArrayList<Solution.result>();
		
		for(int i=0; i<record.length; i++) {
			String[] s = record[i].split(" ");
			
			if(s[0].equals("Enter")) {
				map.put(s[1], s[2]); list.add(new result(s[1], 0));
			}else if(s[0].equals("Leave")) {
				list.add(new result(s[1], 1));
			}else {
				map.put(s[1], s[2]);
			}
		}
		
		int size = list.size();
		String[] io = {"님이 들어왔습니다.", "님이 나갔습니다."};
		String[] answer = new String[size];
		
		for(int i=0; i<size; i++)
			answer[i] = map.get(list.get(i).id) + io[list.get(i).io];
        return answer;
    }
	
	class result {
		String id;
		int io;
		
		public result(String id, int io) {
			this.id = id; this.io = io;
		}
	}
}
