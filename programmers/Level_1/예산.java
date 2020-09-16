/*
Programmers
Level 1 - Java
Summer/Winter Coding(~2018)
예산

https://programmers.co.kr/learn/courses/30/lessons/12982
*/

import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int sum = 0, i = 0;
        Arrays.sort(d);
        for(i=0; i<d.length; i++){
            sum += d[i];
            if(sum > budget)
                return i;
        }
        return i;
    }
}
