/*
Programmers
Level 3 - Java
2019 KAKAO BLIND RECRUITMENT
길 찾기 게임

https://programmers.co.kr/learn/courses/30/lessons/42892
*/

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    static int idx; 
	
	public int[][] solution(int[][] nodeinfo) {
        int[][] answer = new int[2][nodeinfo.length];
        
        ArrayList<Node> list = new ArrayList<Solution.Node>();
        
        for(int i=0; i<nodeinfo.length; i++) 
        	list.add(new Node(i+1, nodeinfo[i][1], nodeinfo[i][0]));
        
        Collections.sort(list);
        
        Node header = list.get(0);
        
        for(int i=1; i<nodeinfo.length; i++) 
        	makeTree(header, list.get(i));
        
        idx = 0; preOrder(header, answer);
        idx = 0; postOrder(header, answer);
        
        return answer;
    }
	
	class Node implements Comparable<Node>{
		int num;
		int y, x;
		Node left, right;
		
		public Node(int num, int y, int x) {
			this.num = num; this.y = y; this.x = x;
		}
		
		@Override
		public int compareTo(Node o) {
			if(y != o.y) return y < o.y ? 1 : -1;
			return x < o.x ? -1 : 1;
		}
	}
	
	public void makeTree(Node a, Node b) {
		if(a.x > b.x) 
			if(a.left != null) 
				makeTree(a.left, b);
			else 
				a.left = b;
		else 
			if(a.right != null) 
				makeTree(a.right, b);
			else 
				a.right = b;
	}
	
	public void preOrder(Node n, int[][] ret) {
		ret[0][idx++] = n.num;
		if(n.left != null) preOrder(n.left, ret);
		if(n.right != null) preOrder(n.right, ret);
	}
	
	public void postOrder(Node n, int[][] ret) {
		if(n.left != null) postOrder(n.left, ret);
		if(n.right != null) postOrder(n.right, ret);
		ret[1][idx++] = n.num;
	}
}
