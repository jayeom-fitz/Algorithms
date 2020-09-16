/*
Programmers
Level 1 - Java
연습문제
이상한 문자 만들기

https://programmers.co.kr/learn/courses/30/lessons/12930
*/

class Solution {
    public String solution(String str) {
        char[] ch = str.toCharArray();
		int from = 0, to = -1;
		while(to < ch.length-1) {
			from = to + 1;
			while(true) {
				to++;
				if(to == ch.length)	break;
				if(ch[to] == ' ')	break;
			}
			
			changeStr(ch, from, to);
			
		}
		
        return new String(ch);
    }
    
    public void changeStr(char[] ch, int from, int to) {
		for(int i=0; i<to - from; i++) {
			ch[from + i] = i%2 == 0 ? 
					Character.toUpperCase(ch[from + i]) : Character.toLowerCase(ch[from + i]);
		}
	}
    
}
