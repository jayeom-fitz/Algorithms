/*
Programmers
Level 2 - Java
2017 카카오코드 예선
카카오프렌즈 컬러링북

https://programmers.co.kr/learn/courses/30/lessons/1829
*/

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    class Pos{
	    int y, x;
	    public Pos(int y, int x) {
		    this.y = y;
		    this.x = x;
	    }
    }
    
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        int[][] p = new int[m][n];
        for(int i=0; i<m; i++) 
        	for(int j=0; j<n; j++)
                p[i][j] = picture[i][j];
        
        for(int i=0; i<m; i++) 
        	for(int j=0; j<n; j++) 
        		if(p[i][j] != 0) {  			
        			numberOfArea++;
        			maxSizeOfOneArea = Math.max(maxSizeOfOneArea, area(p,i,j));
        		}
        
        int[] answer = new int[2];        
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        
        return answer;
    }
	
	public int area(int[][] p, int y, int x) {
		int a = 0;
		int v = p[y][x];
		
		int[] dy = {-1, 1, 0, 0};
        int[] dx = {0, 0, -1, 1};
		
		Queue<Pos> q = new LinkedList<Pos>();
		q.add(new Pos(y, x));
		
		while(!q.isEmpty()) {
			Pos pos = q.poll();
			
			y = pos.y;	x = pos.x;			
			if(p[y][x] == 0) continue;
			p[y][x] = 0; a++;
			
			for(int i=0; i<4; i++) {
				int yy = y + dy[i];
				int xx = x + dx[i];
				
				if(!(yy < 0 || yy >= p.length || xx < 0 || xx >= p[0].length)
						&& v == p[yy][xx])
					q.add(new Pos(yy, xx));
			}
				
		}
		
		return a;
	}
}
