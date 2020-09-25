/*
Programmers
Level 3 - Java
동적계획법(Dynamic Programming)
N으로 표현

https://programmers.co.kr/learn/courses/30/lessons/42895
*/


class Solution {
    int answer = 999999999;
	int v = 0; 
	
	public int solution(int N, int number) {
		v = N;
		
		dfs(0, 0, number);
        
        return answer > 8 ? -1 : answer;
    }
	
	public void dfs(int count, int value, int number) {
		if(count > 8 || count >= answer) return;
		
		if(value == number) {
			answer = Math.min(answer, count); return;
		}
		
		int num = 0;
		for(int i=1; i<9-count; i++) {
			num = num * 10 + v; 
			
			dfs(count + i, value + num, number);
			dfs(count + i, value - num, number);
			
			if(value != 0) {
				dfs(count + i, value * num, number);
				if(value % num == 0) dfs(count + i, value / num, number);
                dfs(count, 0, number - value);
			}
			
			
		}
		
	} 
}
