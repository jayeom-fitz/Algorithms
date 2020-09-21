/*
Programmers
Level 2 - Java
탐욕법(Greedy)
구명보트

https://programmers.co.kr/learn/courses/30/lessons/42885
*/

import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);

        int left = 0, right = people.length - 1;
        
        while(left <= right) {
        	if(left == right || people[left] + people[right] <= limit) {
        		left++;
        	} 
        	
        	right--; answer++;
        }
        
        return answer;
    }
}
