/*
Programmers
Level 2 - Java
2018 KAKAO BLIND RECRUITMENT
[3차] 파일명 정렬

https://programmers.co.kr/learn/courses/30/lessons/17686
*/

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String[] files) {
        String[] answer = new String[files.length];
        
        ArrayList<FileName> list = new ArrayList<Solution.FileName>();
        
        for(int i=0; i<files.length; i++)
        	list.add(new FileName(i, files[i]));
                
        Collections.sort(list);
        
        for(int i=0; i<files.length; i++)
        	answer[i] = list.get(i).fileName;
        
        return answer;
    }
	
	class FileName implements Comparable<FileName>{
		int count, number;
		String fileName, head;

		public FileName(int count, String fileName) {
			this.count = count;
			this.fileName = fileName;
			setting();
		}
		
		void setting() {
			boolean check = false;
			int left = 0, right = 0;
			
			int len = fileName.length();
			for(int i=0; i<len; i++) {
				char ch = fileName.charAt(i);
				
				if(ch >= '0' && ch <= '9') {
					if(!check) {
						left = i; check = true;
					}
				} else if(check) {
					right = i; break;
				}
			}
			
			head = fileName.toLowerCase().substring(0, left);
			
			if(right == 0)
				number = Integer.parseInt(fileName.substring(left));
			else
				number = Integer.parseInt(fileName.substring(left, right));
		}

		@Override
		public int compareTo(FileName o) {
			int ret = this.head.compareTo(o.head);
			
			if(ret != 0) return ret;
			
			if(this.number != o.number) return this.number < o.number ? -1 : 1;
			
			return this.count < o.count ? -1 : 1;
		}
	}
}
