package demo;

import java.util.*;

public class DemoOnly {
	static Scanner sc = new Scanner(System.in);
	static int [] a = new int[100];

	public static void main(String[] args) {
		int n = Integer.parseInt(sc.nextLine());
		node p = null;
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(sc.nextLine());
			p = insert(p, x);
		}
		
		System.out.println(countLevel(p));
		System.out.println("Hello Friends!");
	}
	
	private static int countLevel(node p) {
		if (p == null) {
			return -1;
		}
		
		return 1 + Math.max(countLevel(p.left), countLevel(p.right));
	}

	private static node insert(node p, int x) {
		if (p == null) {
			node q = new node();
			q.info = x;
			q.left = null;
			q.right = null;
			return q;
		} else {
			if (x < p.info) {
				p.left = insert(p.left, x);
			} else {
				p.right = insert(p.right, x);
			}
		}
		
		return p;
	}
}

class node {
	int info;
	node left;
	node right;
}