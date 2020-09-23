/*
Programmers
Level 2 - Java
2018 KAKAO BLIND RECRUITMENT
[3차] n진수 게임

https://programmers.co.kr/learn/courses/30/lessons/17687
*/

class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        
        String str = "";
        int len = 0, max = t * m, idx = 0;
        
        while(len < max) {
        	String s = N_change(n, idx++);
            len += s.length();
        	str += s;
        }
        
        for(int i=p-1; i<max; i+=m)
        	answer += str.charAt(i);
        
        return answer;
    }
	
	public String N_change(int n, int num) {
		String number = "";
		
        if(num == 0) return "0";
        
		while(num != 0) {
			String s = String.valueOf(num % n);
			
			if(n > 10) s = NumberChange(s);
			
			number = s + number;
			num /= n;
		}
		
		return number;
	}
	
	public String NumberChange(String s) {
		if(s.equals("10")) return "A";
		else if(s.equals("11")) return "B";
		else if(s.equals("12")) return "C";
		else if(s.equals("13")) return "D";
		else if(s.equals("14")) return "E";
		else if(s.equals("15")) return "F";
		return s;
	}
}
