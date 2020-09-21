/*
Programmers
Level 2 - Java
연습문제
최댓값과 최솟값

https://programmers.co.kr/learn/courses/30/lessons/12939
*/

class Solution {
    public String solution(String s) {
        String[] strs = s.split(" ");
        
        int value = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        
        for(int i=0; i<strs.length; i++) {
        	value = Integer.parseInt(strs[i]);
        	min = Math.min(min, value);
        	max = Math.max(max, value);
        }
        
        return Integer.toString(min) + " " + Integer.toString(max);
    }
}
