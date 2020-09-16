/*
Programmers
Level 1 - Java
연습문제
자연수 뒤집어 배열로 만들기

https://programmers.co.kr/learn/courses/30/lessons/12932
*/

class Solution {
    public int[] solution(long n) {
         int[] answer = new int[(int) Math.log10(n) + 1];
        
        for(int i=0; i<answer.length; i++) {
        	answer[i] = (int) (n % 10); n /= 10;
        }
        
        return answer;
    }
}
