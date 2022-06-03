package com.study;

import java.util.*;

public class StackTest {

		private static final String color[] = {
				"검정", "노랑", "녹색", "청색", "빨강", "연두색"};
		
	public StackTest() {
	Stack<String> st = new Stack<String>();
	
		for(String color : color) {
			st.push(color);
			
		}
		
		
	}
	public void popStack(Stack<String> st){
		System.out.println("pop : ");
		// 스택이 비어 있지 않으면
		// pop을 해라
		while(!st.empty()) {
			System.out.println(st.pop());
		}
	}
	public static void main(String[] args) {
		
		new StackTest();
		
		
		
		
	}

}
