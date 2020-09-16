/*
Programmers
Level 1 - Java
2019 KAKAO BLIND RECRUITMENT
실패율

https://programmers.co.kr/learn/courses/30/lessons/42889
*/

class Solution {
    public static int[] solution(int N, int[] stages) {
	
		int[] answer = new int[N]; 
        double[] bs = new double[N];
        
        int n = stages.length;
        
        answer[0] = 1;
        for(int i=1; i<N; i++)
        	answer[i] = answer[i-1] + 1;
        
        for(int i=0; i<stages.length; i++) {
        	for(int j=0; j<stages[i] - 1; j++ ) {
        		if(j >= N) break;
        		bs[j]++;
        	}
        }
        
        for(int i=0; i<bs.length; i++) 
        	if(n == 0) 
        		bs[i] = 0; 
        	else {
        		int m = (int)bs[i];
        		bs[i] = (n - bs[i]) / n;
        		n = m;
        	}
        
        for(int i=N-1; i>0; i--) {
        	for(int j=1; j<=i; j++) {
        		if(bs[j-1] < bs[j]) {
        			int temp = answer[j-1];
        			answer[j-1] = answer[j];
        			answer[j] = temp;
        			
        			double tmp = bs[j-1];
        			bs[j-1] = bs[j];
        			bs[j] = tmp;
        		}
        	}
        }
        
        return answer;
    }
}
