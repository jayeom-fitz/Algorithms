/*
Programmers
Level 1 - Java
월간 코드 챌린지 시즌1
두 개 뽑아서 더하기

https://programmers.co.kr/learn/courses/30/lessons/68644
*/

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
		
		int max = 0, ansSize = 0;
		boolean[] check = new boolean[201];
		
		int size = numbers.length;
		
		for(int i=0; i<size-1; i++)
			for(int j=i+1; j<size; j++) {
				if(!check[numbers[i] + numbers[j]]) {
					check[numbers[i] + numbers[j]] = true;
					ansSize++;
					max = max < numbers[i] + numbers[j] ? numbers[i] + numbers[j] : max;
				}
			}
		
		int idx = 0;
		answer = new int[ansSize];
		
		for(int i=0; i<=max; i++)
			if(check[i]) answer[idx++] = i;
		
		return answer;
    }
}
