/*
Programmers
Level 1 - Java
연습문제
제일 작은 수 제거하기

https://programmers.co.kr/learn/courses/30/lessons/12935
*/

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length == 1 ? 1 : arr.length - 1];
		int min = 0, idx = 0;

		if(arr.length == 1) {
			answer[0] = -1;
			return answer;
		}
		
		for(int i=1; i<arr.length; i++)
			if(arr[min] > arr[i])
				min = i;
		
		for(int i=0; i<arr.length; i++)
			if(i == min)
				continue;
			else
				answer[idx++] = arr[i];
		
		return answer;
    }
}
