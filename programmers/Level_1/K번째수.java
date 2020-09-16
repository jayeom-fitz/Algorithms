/*
Programmers
Level 1 - Java
연습문제
K번째수

https://programmers.co.kr/learn/courses/30/lessons/42748
*/

import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
                
        for(int i=0; i<commands.length; i++) {
        	int[] arr = new int[commands[i][1] - commands[i][0] + 1];
        	for(int j=0; j<=commands[i][1] - commands[i][0]; j++)
        		arr[j] = array[commands[i][0] - 1 + j];
        	Arrays.sort(arr);
        	answer[i] = arr[commands[i][2] - 1];
        }
        
        return answer;
    }
}
