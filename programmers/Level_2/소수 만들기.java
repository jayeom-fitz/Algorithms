/*
Programmers
Level 2 - Java
연습문제
Summer/Winter Coding(~2018)
소수 만들기

https://programmers.co.kr/learn/courses/30/lessons/12977
*/

class Solution {

    public static int solution(int[] nums) {
		boolean[] prime = eratos(3000);		
		return ans(nums, prime, 0, 0, 0);
	}	
	
	public static int ans(int[] nums, boolean[] prime, int n, int k, int sum) {
		if(n == 3) 
			return prime[sum] ? 0 : 1;
			
		int answer = 0;
		
		for(int i=k; i<nums.length; i++)
			answer += ans(nums, prime, n+1, i+1, sum+nums[i]);
		
		return answer;
	}

	public static boolean[] eratos(int n) {
		boolean[] prime = new boolean[n+1];
		
		prime[0] = prime[1] = true;
		for(int i=2; i*i<=n; i++)
			if(!prime[i])
				for(int j=i*2; j<=n; j+=i)
					prime[j] = true;
		
		return prime;
	}
    
}
