package com.sortex;
import java.util.*;

class Descending implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		
		
		if (o1 instanceof Comparable && o2 instanceof Comparable) {
		Comparable c1 = (Comparable)o1;
		Comparable c2 = (Comparable)o2;
		
		return c2.compareTo(o2)*-1; // -1을 곱해서 기본 정렬박식을 역으로 변경함
		
		//return c1.compareTo(o1)*-1;
	}
	return -1;
}



public class ComparatorEx {

	
	
	 class Myucompara my comparator;
	public void main(String[] args) {
		
		String [] strArr = {"cat", "dog", "lion", "tiger"};
		Arrays.sort(strArr);
		
		System.out.println("strArr"+Arrays.toString(strArr));
		// 대소문자 구분없이
		Arrays.sort(strArr);
		System.out.println("strArr"+Arrays.toString(strArr));
		
		System.out.println("strArr : "+Arrays.toString(strArr));
	}

	
	
	//내림차순 정리
}		


}

