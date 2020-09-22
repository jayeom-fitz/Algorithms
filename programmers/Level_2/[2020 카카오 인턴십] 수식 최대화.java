/*
Programmers
Level 2 - Java
2020 카카오 인턴십
수식 최대화

https://programmers.co.kr/learn/courses/30/lessons/67257

- String을 만들어주기 위해 쌍따옴표("")를 더해주었는데, 그것보다 valueOf 가 속도가 빠르게 나옴
- save == -1 로 조건문을 걸어주었는데, 그것이 런타임 에러의 원인이 되었다.
*/

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static char[] op = {'*', '+', '-'};
	
	public static long solution(String expression) {
        long answer = 0;
        
        Queue<String> q = new LinkedList<String>();
        
        int length = expression.length();
		int pos = -1;
		
		for(int i=0; i<length; i++) {
			char ch = expression.charAt(i);
			if(ch == op[0] || ch == op[1] || ch == op[2]) {
				q.add(expression.substring(pos, i));
				q.add(String.valueOf(ch));
				pos = -1;
			} else if(pos == -1) {
				pos = i;
			}
			
			if(i == length - 1)
				q.add(expression.substring(pos));
		}
        
        for(int i=0; i<op.length; i++) {
        	answer = Math.max(answer, dfs(q, op[i], 1 << i));
        }
        
        return answer;
    }
	
	public static long dfs(Queue<String> q, char oper, int check) {
		long ret = 0;

		Queue<String> queue = new LinkedList<String>();	queue.addAll(q);
		Queue<String> queue2 = new LinkedList<String>();
		
        boolean flag = false;
		long save = -1;
		
		while(!queue.isEmpty() || flag) {
			long n1;
			if(!flag) {
				n1 = Long.parseLong(queue.poll());
			} else {
				n1 = save; flag = false;
			}
			
			if(queue.isEmpty()) {
				queue2.add(String.valueOf(n1)); break;
			}
			
			String st = queue.poll();
			
			if(!st.equals(Character.toString(oper))) {
				queue2.add(String.valueOf(n1)); queue2.add(st); continue;
			}
			
			long n2 = Long.parseLong(queue.poll());
            
            if(oper == '*')
                save = n1 * n2;
            else if(oper == '+')
                save = n1 + n2;
            else
                save = n1 - n2;
            
            flag = true;
		}
		
		if(check == (1 << op.length) - 1) {
			return Math.abs(Long.parseLong(queue2.poll()));
		}
		
		for(int i=0; i<op.length; i++)
			if((check >> i) % 2 == 0 ) {
				ret = Math.max(ret, dfs(queue2, op[i], check | 1 << i));
			}
		
		return ret;
	}

}
