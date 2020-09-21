/*
Programmers
Level 2 - Java
연습문제
완전탐색
소수 찾기

https://programmers.co.kr/learn/courses/30/lessons/42839
*/

import java.util.Arrays;
import java.util.Collections;

class Solution {
    Integer[] nums;
	boolean[][] prime;
	
	public int solution(String numbers) {
        int answer = 0;
        
        int max = init(numbers);
        if(max <= 1) return 0;
        
        findPrime(max);
        
        for(int i=0; i<nums.length; i++)
        	answer += findCombination(nums[i], 1 << i);
        
        return answer;
    }

	private int findCombination(Integer value, int check) {
		if(prime[1][value])	return 0;
		
		prime[1][value] = true;
		
		int ans = prime[0][value] ? 0 : 1;
		
		for(int i=0; i<nums.length; i++)
			if((check >> i) % 2 != 1)
				ans += findCombination(value * 10 + nums[i], check | 1 << i);
		
		return ans;
	}

	private void findPrime(int max) {
		prime = new boolean[2][max + 1];
		
		for(int i=2; i*i<=max; i++) {
			if(!prime[0][i]) 
				for(int j=i*2; j<=max; j+=i) 
					prime[0][j] = true;
		}
		
		prime[0][0] = prime[0][1] = true;
	}

	private int init(String numbers) {
		char[] ch = numbers.toCharArray();
		nums = new Integer[ch.length];
		
		for(int i=0; i<nums.length; i++)
			nums[i] = ch[i] - '0';
		
		Arrays.sort(nums, Collections.reverseOrder());
		
		int max = 0; 
		
		for(int i=0; i<nums.length; i++) {
			max *= 10; max += nums[i];
		}
		
		return max;
	}
}
