package com.set;
import java.util.*;
public class HashSteEx {

	public static void main(String[] args) {
		// set : 중복을 허용안함 , 순서가 없음
		Set<String> dog = new HashSet<>();
		
		dog.add("진돗개");
		dog.add("풍산개");
		dog.add("세퍼드");
		
		System.out.println("set 데이터 : ");
		System.out.println(dog);
		
		
		
		dog.add("진돗개");
		System.out.println(dog);
		// 괄호 벗기기
		
		Iterator<String> it = dog.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.print(str+"  ");
		}
		
	}

}
