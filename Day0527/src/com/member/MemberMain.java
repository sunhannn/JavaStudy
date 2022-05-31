package com.member;


import java.util.*;

public class MemberMain {

	static MemberVO[] members;
	
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		MemberService memService = new MemberService();
		
		members = new MemberVO[0];
		//ArrayList<Member> members = new ArrayList<MemberVO>();
		
		boolean isStop = false;
		
		do {
			System.out.println("다음 메뉴 중 하나를 선택하세요.");
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 목록보기");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 회원 수정");
			System.out.println("5. 	종료");
			
			String command = sc.next();
			
			switch(command) {
			case "1" :
				WriteAction writeAction = new WriteAction();
				MemberService.process(writeAction,sc);
				break;
			case "2" :
				ListAction listAction = new ListAction();
				MemberService.process(listAction,sc);
				break;
			case "3" :
				
				DeleteAction deldeAction = new DeleteAction();
				
				MemberService.process(deldeAction, sc);
				break;
			case "4" :
				UpdateAction updateAction = new UpdateAction();
				MemberService.process(updateAction, sc);
				break;
			case "5" : 
				isStop = true;
			
			
			}
			
			
			
		}while(!isStop);
		
		
		
		
		
		
	}

}
