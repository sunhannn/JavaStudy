package com.study;

import java.util.*;

public class QueTest {	
	private static final String color[] = {
		"검정", "노랑", "녹색", "청색", "빨강", "연두색"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Queue<String> qu = new LinkedList<>();
		for(String color : color) {
			qu.offer(color);
		}
		
		while (qu.peek() != null) {
			System.out.println(qu.poll());
		}
		
	}

}
