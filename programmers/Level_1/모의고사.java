/*
Programmers
Level 1 - Java
완전탐색
모의고사

https://programmers.co.kr/learn/courses/30/lessons/42840
*/

class Solution {
    public int[] solution(int[] answers) {
       int[] answer = {};
        
        int[][] s = {
        		{1, 2, 3, 4, 5},
        		{2, 1, 2, 3, 2, 4, 2, 5},
        		{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        int[] c = new int[3];
        
        for(int i=0; i<answers.length; i++){
            for(int j=0; j<3; j++)
                if(answers[i] == s[j][i%s[j].length]) c[j]++;
        }
        
        int max = 0;
        for(int i=0; i<3; i++) max = max > c[i] ? max : c[i];
        int cnt = 0;
        for(int i=0; i<3; i++) 
            if(max == c[i]) cnt++;
        
        answer = new int[cnt];
        int idx = 0;
        for(int i=0; i<3; i++) 
            if(max == c[i]) answer[idx++] = i+1;
        return answer;
    }
}
