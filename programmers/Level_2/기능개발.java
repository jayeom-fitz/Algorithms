/*
Programmers
Level 2 - Java
스택/큐
기능개발

https://programmers.co.kr/learn/courses/30/lessons/42586
*/

class Solution {
public static int[] solution(int[] progresses, int[] speeds) {

        int[] date = new int[progresses.length];
        
        for(int i=0; i<date.length; i++) {
        	int work = 100 - progresses[i];
        	date[i] = work / speeds[i] + (work % speeds[i] == 0 ? 0 : 1);
        }
      
        int idxD = 0, idx = 0;
        int[] answer = new int[1];	answer[0] = 1;
        
        for(int i=1; i<date.length; i++) {
        	if(date[idxD] >= date[i]) {
        		answer[idx]++;
        	}else {
        		answer = sizeUp(answer);
        		idxD = i; answer[++idx]++;
        	}
        }
        
        return answer;
    }
	
	public static int[] sizeUp(int[] ans) {
		int[] temp = new int[ans.length+1];
		
		for(int i=0; i<ans.length; i++)
			temp[i] = ans[i];
		
		return temp;
	}
}
