/*
Programmers
Level 2 - Java
2020 KAKAO BLIND RECRUITMENT
괄호 변환

https://programmers.co.kr/learn/courses/30/lessons/60058
*/

class Solution {
    public static String solution(String p) {
        return bracket(p);
    }
	
	public static String bracket(String w) {
		if(w.length() < 1) return w;
		
		if(correct(w)) return w;
		
		int length = w.length();
		String u = "", v = "";
		
		for(int i=2; i<=length; i+=2) {
			if(balance(w.substring(0, i))) {
				if(i == length) 
					u = w.substring(0); 
				else {
					u = w.substring(0, i);
					v = w.substring(i);
				}
				
				break;
			}
		}
		
		if(correct(u)) 
			return u + bracket(v);
		
		String ret = "(" + bracket(v) + ")";
		ret += u.length() == 2 ? "" : reverse(u.substring(1, u.length() - 1)); 
		
		return ret;
	}
	
	public static boolean balance(String b) {
		int balance = 0;
		int length = b.length();
		
		for(int i=0; i<length; i++)
			if(b.charAt(i) == '(') balance++;
			else balance--;
		
		return balance == 0;
	}
	
	public static boolean correct(String c) {
		int balance = 0;
		int length = c.length();
		
		for(int i=0; i<length; i++) {
			if(c.charAt(i) == '(') balance++;
			else balance--;
			
			if(balance < 0) return false;
		}
		
		return balance == 0;
	}
	
	public static String reverse(String r) {
		String ret = "";
		int length = r.length();
		
		for(int i=0; i<length; i++) {
			if(r.charAt(i) == '(') ret += ')';
			else ret += '(';
		}
		
		return ret;
	}
}
