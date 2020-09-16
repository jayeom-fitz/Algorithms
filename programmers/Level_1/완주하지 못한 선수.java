/*
Programmers
Level 1 - Java
해시
완주하지 못한 선수

https://programmers.co.kr/learn/courses/30/lessons/42576
*/

import java.util.Arrays;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i = 0; i<completion.length;i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[participant.length-1];
    }
}
