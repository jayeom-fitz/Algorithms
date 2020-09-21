/*
Programmers
Level 2 - Java
2017 카카오코드 본선
단체사진 찍기

https://programmers.co.kr/learn/courses/30/lessons/1835
*/

class Solution {
    char[] c = {'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
	String[] d;
 	
	public int solution(int n, String[] data) {
		d = data;
        return dfs("", 0);
    }
	
	public int dfs(String s, int check) {
		if(check == (1 << 8) - 1) {
			return correct(s);
		}
		
		int ret = 0;
		
		for(int i=0; i<8; i++)
			if((check >> i) % 2 == 0) {
				ret += dfs(s+c[i], check | (1 << i));
			}
		
		return ret;
	}

	private int correct(String s) {
        
        
		for(int i=0; i<d.length; i++) {
			String jo = d[i];
			
			char c1 = jo.charAt(0);
			char c2 = jo.charAt(2);
			
			char op = jo.charAt(3);
			int value = jo.charAt(4) - '0';
			int diff = Math.abs(s.indexOf(c1) - s.indexOf(c2)) - 1;
			
			if(op == '=' && diff != value) return 0;
			if(op == '<' && diff >= value) return 0;
			if(op == '>' && diff <= value) return 0;

		}

		return 1;
	}
}
