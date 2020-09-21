/*
Programmers
Level 2 - Java
연습문제
땅따먹기

https://programmers.co.kr/learn/courses/30/lessons/12913
*/

class Solution {
    int solution(int[][] land) {
        int[][] dp = new int[2][4];

        for(int i=0; i<land.length; i++) {
        	for(int j=0; j<4; j++)
        		for(int k=0; k<4; k++)
        			if(j!=k)
        				dp[1][j] = Math.max(dp[1][j], dp[0][k] + land[i][j]);
        	
        	for(int j=0; j<4; j++) {
        		dp[0][j] = dp[1][j];	dp[1][j] = 0;
        	}
        }
        
        return Math.max(  Math.max(dp[0][0], dp[0][1]),  Math.max(dp[0][2], dp[0][3])  );
    }
}
