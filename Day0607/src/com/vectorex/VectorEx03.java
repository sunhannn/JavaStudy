package com.vectorex;
import java.util.*;
public class VectorEx03 {

	private static final String colors[] = {"검정","노랑","녹색","파랑","주황색","연두색","보라색"};
	
	
	
	
	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		
		for (String str : colors) {
			v.add(str);
			
			
			
		}
		System.out.println("첫번째 요소 : "+v.firstElement());
		System.out.println("마지막 요소 : "+v.lastElement());
		System.out.println("세번째 요소 : "+v.get(2));
		System.out.println("요소 개수 : "+v.size());
		System.out.println("벡터의 크기 : "+v.capacity());
		
		// 첫번째 요소값을 흰색으로 변경
			v.set(0, "흰색");
			System.out.println(v.firstElement());
			System.out.println("요소 개수 : "+v.size());
		
		// 벡터에 데이터(요소) 추가
		// 첫번째 요소에 빨강 추가
			v.insertElementAt("빨강", 0);
			System.out.println(v.firstElement());
		
		
		// 전체 출력
		
		for (String str : v) {
			System.out.print(str+" ");
			System.out.println();
		}

		// 오름 차순 정렬
		Collections.sort(v);
		// 오름차순 정렬 후
		System.out.println("\n 오름차순 정렬 후 : ");
		for (String str : v) {
			System.out.println(str+ " ");
			System.out.println();
			//검색은 오름차순 정렬된 자료에서만 가능함
			int idx = Collections.binarySearch(v, "파랑");
			System.out.println("파랑 : "+idx+" index에 있음"); // 있으면 인덱스 출력, 없으면 음수 출력
			
			
			// 내림차순 정렬
		/*	Collections.sort(v, Collections.reverseOrder());
			for (String str : v) {
				System.out.println(str+ " ");
				System.out.println();
			}
			*/
			//내림차순 검색
			idx = Collections.binarySearch(v, "연두색",Collections.reverseOrder());
			System.out.println("연두색 : "+idx+"index에 있음"); 
			
			// 검색
			String s = "노랑";
			if(v.contains(s)) {
			 int i = v.indexOf(s)+1;
			 System.out.println(s+"---> 위치 : "+i);
				 
			 
			}
			
			
		}
		
		
	}

}
