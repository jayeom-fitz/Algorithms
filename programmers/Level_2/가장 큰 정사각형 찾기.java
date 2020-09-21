/*
Programmers
Level 2 - Java
연습문제
가장 큰 정사각형 찾기

https://programmers.co.kr/learn/courses/30/lessons/12905
*/

class Solution
{
    public int solution(int [][]board)
    {
        int answer = 0;
        
        if(board.length == 1 && board[0].length == 1) {
        	return board[0][0];
        } else if(board.length == 1) {
        	for(int i=0; i<board[0].length; i++) if(board[0][i] == 1) return 1; return 0;
        } else if(board[0].length == 1) {
        	for(int i=0; i<board.length; i++) if(board[i][0] == 1) return 1; return 0;
        } 
        	
        for(int i=1; i<board.length; i++)
        	for(int j=1; j<board[0].length; j++) 
        		if(board[i][j] == 1) {
        			board[i][j] = Math.min(board[i-1][j-1], Math.min(board[i-1][j], board[i][j-1])) + 1;
        			answer = Math.max(board[i][j], answer);
        		}
        
        return answer * answer;
    }
}
