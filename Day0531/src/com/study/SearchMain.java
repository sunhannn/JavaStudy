package com.study;
import java.util.*;
public class SearchMain {
// 이름을 파라미터로 하여 검색하는 프로그램
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SerachService ssv = new SerachService();
		
		do {
			System.out.println("검색 회원 이름 입력 : ");
			String name = sc.next();
		
			boolean searchResult = ssv.searchMember(name);
			if(searchResult) break;
			System.out.println("해당 회원이 존재하지 않습니다.");
			
		}while(true);
		
		
		
		
		
		
		
	}

}
