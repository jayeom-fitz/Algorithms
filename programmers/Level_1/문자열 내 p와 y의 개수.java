/*
Programmers
Level 1 - Java
연습문제
문자열 내 p와 y의 개수

https://programmers.co.kr/learn/courses/30/lessons/12916
*/

class Solution {
    boolean solution(String s) {
        int p = 0, y = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P')
                p++;
            else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y')
                y++;
        }

        return p==y;
    }
}
