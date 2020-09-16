/*
Programmers
Level 1 - Java
연습문제
나누어 떨어지는 숫자 배열

https://programmers.co.kr/learn/courses/30/lessons/12910
*/

import java.util.Arrays;
class Solution {
  public int[] solution(int[] arr, int divisor) {
	      int[] a = new int[arr.length];
	      int idx = 0;
	      
	      for(int i=0; i<arr.length; i++) {
	    	  if(arr[i] % divisor == 0)	a[idx++] = arr[i];
	      }
	      
	      int[] answer = new int[1];
	      
	      if(idx == 0) answer[0] = -1;
	      else {
	    	  answer = new int[idx];
	    	  for(int i=0; i<idx; i++) answer[i] = a[i];
	    	  Arrays.sort(answer);
	      }
	      
	      return answer;
	}
}
