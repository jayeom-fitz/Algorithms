/*
Programmers
Level 2 - Java
2017 팁스타운
예상 대진표

https://programmers.co.kr/learn/courses/30/lessons/12985
*/

class Solution
{
    public static int solution(int n, int a, int b)
    {
        int i;

        if(a > b) {
        	int temp = a; a = b; b = temp;
        }
        
        for(i=1; n != 0; i++, n /= 2) {
        	if(a%2 == 1 && a+1 == b) return i;
        	
        	a = a / 2 + a % 2;
        	b = b / 2 + b % 2;
        }

        return i;
    }
}
