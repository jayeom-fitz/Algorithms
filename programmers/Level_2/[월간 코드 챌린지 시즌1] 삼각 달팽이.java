/*
Programmers
Level 2 - Java
월간 코드 챌린지 시즌1
삼각 달팽이

https://programmers.co.kr/learn/courses/30/lessons/68645
*/

class Solution {
    public int[] solution(int n) {
        int max = n * (n + 1) / 2;
        int idx = 0;
        
        int[][] triangle = new int[n+1][n+1];
        
        int dir = 0;
        int[] dirY = {1, 0, -1}; 
        int[] dirX = {0, 1, -1}; 
        int y = 1, x = 1;
        
        while(++idx <= max) {
        	triangle[y][x] = idx;
        	
        	if(y + dirY[dir] > n || x + dirX[dir] > n || triangle[y + dirY[dir]][x + dirX[dir]] != 0)
        		dir = (dir + 1) % 3;
        	
        	y += dirY[dir]; x += dirX[dir];
        }
        
        int[] answer = new int[max];
        idx = 0;
        
        for(int i=1; i<=n; i++)
        	for(int j=1; j<=n; j++) {
        		if(triangle[i][j] == 0) break;
        		
        		answer[idx++] = triangle[i][j];
        	}
        
        return answer;
    }
}
