package com.study;
	import java.util.*;
public class ArrayTest {

	public static void main(String[] args) {
		
		String names[] = {"홍길동", "전우치","이도","세종대왕","이순신","강감찬","양만춘"};
		
		Scanner sc = new Scanner(System.in);
		int index = 1;
		do {
			System.out.println("검색할 이름 입력");
			String name = sc.next();
			
			for(int i = 0; i < names.length;i++) {
				//입력 받은 이름과 배열에 저장되어 있는 이름이 같은 지를 비교
				if(name.equals(names[i])) {
					index =	i;
					
					
				}
				
			}
			if(index != 1) { //찾았다.
				System.out.println(name+"은 배열의"+index+"인덱스 위치에서 찾았습니다.");
				break;
			}else {
				System.out.println("입력하신 이름은 names 배열에 없습니다.");
				
			}
			
			
		}while(true);
		
		for(String s : names) {
			System.out.println(s+"\t");
		}
		
	}

}
