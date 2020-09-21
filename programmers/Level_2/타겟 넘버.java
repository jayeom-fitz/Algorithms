/*
Programmers
Level 2 - Java
연습문제
깊이/너비 우선 탐색(DFS/BFS)
타겟 넘버

https://programmers.co.kr/learn/courses/30/lessons/43165
*/

class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, 0, 0, target);
    }
	
	public int dfs(int[] numbers, int n, int v, int t) {
		if(n == numbers.length) 
			return t == v ? 1 : 0;
		
		return dfs(numbers, n+1, v-numbers[n], t) + dfs(numbers, n+1, v+numbers[n], t);
	}
}
