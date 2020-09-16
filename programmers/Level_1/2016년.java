/*
Programmers
Level 1 - Java
연습문제
2016년

https://programmers.co.kr/learn/courses/30/lessons/12901
*/

class Solution {
  public String solution(int a, int b) {
      String[] DAY = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		int dayIdx = 5;
		int month = 1, date = 1;
		
		while(true) {
			if(month == a) {
				dayIdx += b - 1;
				dayIdx %= 7;
				break;
			}
			else {
				dayIdx += dateOfMonth(month++);
			}
		}
		
		return DAY[dayIdx];
  }
    public static int dateOfMonth(int month) {
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			return 31;
		case 4: case 6: case 9: case 11:
			return 30;
		case 2:
			return 29;
		}
		return 0;
	}
}
