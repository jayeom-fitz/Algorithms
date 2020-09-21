/*
Programmers
Level 2 - Java
연습문제
해시
전화번호 목록

https://programmers.co.kr/learn/courses/30/lessons/42577
*/

import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {		
		Arrays.sort(phone_book); 
		
		for(int i=0; i<phone_book.length-1; i++)
			for(int j=i+1; j<phone_book.length; j++) {
				if(phone_book[i].length() < phone_book[j].length()) {
					if(phone_book[i].equals(phone_book[j].substring(0, phone_book[i].length())))
						return false;
				}else {
					if(phone_book[i].equals(phone_book[j]))
						return false;
				}
			}
		
        return true;
    }
}

/*
import java.util.Comparator;

  Arrays.sort(phone_book, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() < o2.length() ? -1 : 1;
			}
		});

길이 순으로 정렬한 후에 찾으려 했는데 런타임 에러가 남
근데도 정답이 맞게 나온다. 왜인지..
*/
