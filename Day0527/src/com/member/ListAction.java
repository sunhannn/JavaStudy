package com.member;

import java.util.Scanner;

public class ListAction implements Action {

	@Override
	public void excute(Scanner sc) {
		// TODO Auto-generated method stub

		MemberVO[] members = MemberMain.members;
		if(members.length >= 1) {
			
			for (int i = 0; i < members.length;i++) {
				System.out.println("이름 :"+members[i].getName()+", 전화번호 : "+members[i]+", 국적 : "+members[i].getNation()
						+", 나이 : "+members[i].getAge()+", 이메일 : "+members[i].getEmail());
				
			}
			
			
		}else {
			System.out.println("회원 정보가 존재하지 않습니다.");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	}

}
