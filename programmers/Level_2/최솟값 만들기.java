/*
Programmers
Level 2 - Java
연습문제
최솟값 만들기

https://programmers.co.kr/learn/courses/30/lessons/12941
*/

import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=0; i<A.length; i++)
        	answer += A[i] * B[B.length - i - 1];

        return answer;
    }
}
