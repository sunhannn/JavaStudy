package com.study;

import java.util.*;


public class ArrayListEx {

	
	
	
	public static void main(String[] args) {
		
		List<String>list1 = new ArrayList<String>();
		list1.add("공각기동때");
		list1.add("원령공주");
		
		List<String>list2 = new ArrayList<String>(list1);
		list2.add("라퓨타");
		
		List<String>list3 = new ArrayList<String>();
		list3.addAll(list2);
		
		int n = list3.indexOf("원령공주");
		System.out.println(n);
		list3.add(n+1,"코난");
		
		System.out.println(list3);
		
		ListIterator<String> it = list3.listIterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
				
	}

}
