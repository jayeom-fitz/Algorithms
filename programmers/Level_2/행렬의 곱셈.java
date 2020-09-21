/*
Programmers
Level 2 - Java
연습문제
행렬의 곱셈

https://programmers.co.kr/learn/courses/30/lessons/12949
*/

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for(int i=0; i<answer.length; i++)
        	for(int j=0; j<answer[i].length; j++)
        		answer[i][j] = calc(arr1, arr2, i, j);
        
        return answer;
    }
	
	public int calc(int[][] arr1, int[][] arr2, int y, int x) {
		int sum = 0;
		
		for(int i=0; i<arr1[y].length; i++)
			sum += arr1[y][i] * arr2[i][x];
		
		return sum;
	}
}
