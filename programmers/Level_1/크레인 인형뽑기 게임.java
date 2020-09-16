/*
Programmers
Level 1 - Java
2019 카카오 개발자 겨울 인턴십
크레인 인형뽑기 게임

https://programmers.co.kr/learn/courses/30/lessons/64061
*/

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        int[] arr = new int[moves.length];
        int idx = 1;
        
        for(int i=0; i<moves.length; i++){
            int k = moves[i] - 1;
            for(int j=0; j<board[k].length; j++){
                if(board[j][k] == 0) continue;
                
                if(board[j][k] == arr[idx - 1]){
                    idx--; answer++;
                }
                else{
                    arr[idx++] = board[j][k];
                }
                
                board[j][k] = 0;
                break;
            }
        }
        
        return answer*2;
    }
}
