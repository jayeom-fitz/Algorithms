/*
Programmers
Level 2 - Java
2018 KAKAO BLIND RECRUITMENT
[3차] 방금그곡

https://programmers.co.kr/learn/courses/30/lessons/17683
*/

class Solution {
    public String solution(String m, String[] musicinfos) {
        m = change(m);
		
        String answer = "(None)";
    	int max = 0;
        
		for(int i=0; i<musicinfos.length; i++) {
        	String s = check(m, musicinfos[i]);
        	
        	if(s != null) {
        		String[] check = s.split(",");
        		
        		if(max < Integer.parseInt(check[1])) {
        			max = Integer.parseInt(check[1]); answer = check[0];
        		}
        	}
        }
        
        return answer;
    }
	
	public String check(String m, String musicinfo) {
		String[] info = musicinfo.split(",");
		
		info[3] = change(info[3]);
		
		String[] start = info[0].split(":");
		String[] end = info[1].split(":");
		
		int time = Integer.parseInt(end[0]) - Integer.parseInt(start[0]);
		time = Integer.parseInt(end[1]) - Integer.parseInt(start[1]) + time * 60;
		
		int len = info[3].length();
		
		String s = "";
		for(int i=0; i<time/len; i++) s += info[3];
	
		if(time % len != 0) s += info[3].substring(0, time % len);
		
		if(s.contains(m))
			return info[2] + "," + time;
					
		return null;
	}
	
	public String change(String s) {
		String ret = "";
		
		s = s.toLowerCase();
		
		int length = s.length();
		for(int i=0; i<length; i++) {
			char ch = s.charAt(i);
			
			if(i != length - 1 && s.charAt(i+1) == '#') {
				i++; ch = (char) (ch - 'a' + 'A');
			}
			
			ret += ch;
		}
		
		return ret;
	}
}
