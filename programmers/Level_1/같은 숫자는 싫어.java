/*
Programmers
Level 1 - Java
연습문제
같은 숫자는 싫어

https://programmers.co.kr/learn/courses/30/lessons/12906
*/

import java.util.*;

public class Solution {
	public int[] solution(int []arr) {
        int[] answer = {};
        int[] saveA = new int[arr.length];
        int idx = 0;
        
        saveA[idx++] = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                saveA[idx++] = arr[i];
            }
        }
        
        answer = new int[idx];
        for(int i=0; i<idx; i++)
            answer[i] = saveA[i];
        
        return answer;
	}
}
