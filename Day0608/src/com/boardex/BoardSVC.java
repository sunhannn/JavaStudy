package com.boardex;
import java.util.*;
public class BoardSVC {
		
	
	ArrayList<BoardVO>boardList;
	
	public BoardSVC() {
		
		boardList = new ArrayList<BoardVO>();
		
	}
	
	// 글쓰기
		public void writeArticle(Scanner sc) {
			
			System.out.println("게시판 글을 작성 하세요");
			System.out.println("작성자 : ");
			String register = sc.next();
			System.out.println("email : ");
			String email = sc.next();
			System.out.println("비밀번호 : ");
			String passwd = sc.next();
			System.out.println("제목 : ");
			String subject = sc.next();
			System.out.println("글내용 : ");
			String content = sc.next();
			
			BoardVO vo = new BoardVO(register, subject, email, content, passwd);
			// Arraylist에 추가
			boardList.add(vo);
		}
	
	
	// 글을 리스트에 추가
		private void addArticle(BoardVO vo) {
			boardList.add(vo);
		}
	// 목록보기
		public void listAticle(Scanner sc) {
			
			if(boardList.size() > 0) {
				for (int i = 0 ; i < boardList.size(); i++) {
					System.out.println(boardList.get(i));
					
					
					
					
					
				}
				}else {
					System.out.println("등록된 게시글이 없습니다.");
				
				
			}
			
			
			
			
		}
		
		
		
		
	// 글삭제
	
		public void removeArticle(Scanner sc) {
			System.out.println("게실물 제거할데에는 글의 작성자와 비밀번호를 입력하세요.");
			System.out.println("작성자 : ");
			String register = sc.next();
			System.out.println("비밀번호 : ");
			String passwd = sc.next();
			removeArticle(register,passwd);
		
		}
		

		public void removeArticle (String register, String  passwd) {
			if(boardList.size() > 0) {
				int index = -1;
				for (int i =0; i < boardList.size(); i++) {
					if (boardList.get(i).getRegister().equals(register)){
						if(boardList.get(i).getPasswd().equals(passwd)) {
							boardList.remove(boardList.get(i));
							index = i;
							System.out.println("삭제 완료");
						}
					}
				}
				if(index == -1){ // 인덱스가 없는경우
				System.out.println(" 해당 글에 작성자가 없거나 비밀번호가 일치하지 않습니다.");
				}
				
			}
		}
}
