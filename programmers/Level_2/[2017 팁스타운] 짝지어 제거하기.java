/*
Programmers
Level 2 - Java
2017 팁스타운
짝지어 제거하기

https://programmers.co.kr/learn/courses/30/lessons/12973
*/

import java.util.Stack;

class Solution
{
    public static int solution(String s)
    {
		Stack<Character> stack = new Stack<Character>();
		int length = s.length();
		
		for(int i=0; i<length; i++) {
			if(stack.isEmpty())
				stack.push(s.charAt(i));
			else {
				if(stack.peek().equals(s.charAt(i)))
					stack.pop();
				else
					stack.push(s.charAt(i));
			}
		}       

        return stack.isEmpty() ? 1 : 0;
    }
}
