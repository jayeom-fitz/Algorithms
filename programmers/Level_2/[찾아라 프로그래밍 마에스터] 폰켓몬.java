/*
Programmers
Level 2 - Java
찾아라 프로그래밍 마에스터
폰켓몬

https://programmers.co.kr/learn/courses/30/lessons/1845
*/

import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int answer = 1;
        
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++)
        	if(nums[i] != nums[i-1])
        		answer++;
        return answer < nums.length / 2 ? answer : nums.length / 2;
    }
}
