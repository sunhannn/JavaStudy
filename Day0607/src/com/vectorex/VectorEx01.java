package com.vectorex;
import java.util.*;
public class VectorEx01 {

	private static final String colors[] = {"검정", "노랑", "청색", "녹생", "빨강", "연두색"};
	public static void main(String[] args) {
		
		int i;
		String str;
		Vector<String> v = new Vector<>();
		for (i = 0; i <colors.length;i++) {
			v.add(colors[i]);
			
		}
		System.out.println("전체 출력");
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			str = it.next();
			System.out.println(str+" ");
		}
		
		
		
	}

}
