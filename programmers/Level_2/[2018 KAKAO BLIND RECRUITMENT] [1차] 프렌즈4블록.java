/*
Programmers
Level 2 - Java
2018 KAKAO BLIND RECRUITMENT
[1차] 프렌즈4블록

https://programmers.co.kr/learn/courses/30/lessons/17679
*/

class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        
        char[][] b = new char[m][n];
        
        for(int i=0; i<m; i++) 
        	b[i] = board[i].toCharArray();

        while(true) {
        	int cnt = rect(b);
        	
        	if(cnt == 0) break;
        	
        	answer += cnt;
        	
        	drop(b);
        }
        
        return answer;
    }
	
	public int rect(char[][] board) {
		int ret = 0;
		boolean[][] check = new boolean[board.length][board[0].length];
		
		for(int i=0; i<board.length-1; i++) 
			for(int j=0; j<board[i].length-1; j++) 
				if(board[i][j] != 'X') 
					if(board[i][j] == board[i+1][j] && board[i][j] == board[i][j+1] && board[i][j] == board[i+1][j+1]) 
						check[i][j] = check[i+1][j] = check[i][j+1] = check[i+1][j+1] = true;
		
		for(int i=0; i<check.length; i++)
			for(int j=0; j<check[0].length; j++)
				if(check[i][j]) {
					board[i][j] = 'X'; ret++;
				}
		
		return ret;
	}
	
	public void drop(char[][] board) {
		for(int i=board.length-2; i>=0; i--) {
			for(int j=0; j<board[0].length; j++) {
				int idx = i+1;
				while(idx < board.length && board[idx][j] == 'X') {
					board[idx][j] = board[idx-1][j]; board[idx-1][j] = 'X'; idx++;
				}
			}
		}
	}
}
