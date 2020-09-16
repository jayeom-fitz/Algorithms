/*
Programmers
Level 1 - Java
연습문제
정수 내림차순으로 배치하기

https://programmers.co.kr/learn/courses/30/lessons/12933
*/

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        Integer[] answer = new Integer[(int) Math.log10(n) + 1];
        
        for(int i=0; i<answer.length; i++) {
        	answer[i] = (int) (n % 10); n /= 10;
        }
        
        Arrays.sort(answer, Collections.reverseOrder());
        
        for(int i=0; i<answer.length; i++) {
        	n *= 10; n += answer[i];
        }
        
        return n;
    }
}
