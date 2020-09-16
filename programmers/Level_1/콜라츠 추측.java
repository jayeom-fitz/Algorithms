/*
Programmers
Level 1 - Java
연습문제
콜라츠 추측

https://programmers.co.kr/learn/courses/30/lessons/12943
*/

class Solution {
    public int solution(long num) {
        if(num == 1)
            return 0;
        
		for(int i=1; i<=500; i++) {
			num = num%2 == 0 ? num / 2L : num * 3L + 1L;
			if(num == 1)
				return i;
		}

        return -1;
    }
}
