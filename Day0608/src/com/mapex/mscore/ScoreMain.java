package com.mapex.mscore;
import java.io.*;
public class ScoreMain {

	public static void main(String[] args) throws IOException {
		
		Score score = new ScoreImpl();
		char ch;
		System.out.println(">>      성적 처리       <<");
		while(true) {
			
			do {
				System.out.println("\n 1. 입력");
				System.out.println("\n 2. 수정");
				System.out.println("\n 3. 이름 검색");
				System.out.println("\n 4. 삭제");
				System.out.println("\n 5. 전체 출력");
				System.out.println("\n 6. 전체 출력(총점 순)");
				System.out.println("\n 7. 종료");
				
				System.out.println("메뉴 선택 : ");
				ch = (char)System.in.read();
				System.in.skip(2);
				
				
				
			}while(ch < '1' || ch > '7');
			
			switch(ch) {
			case '1' : score.insert(); break;
			case '2' : score.update(); break;
			case '3' : score.search(); break;
			case '4' : score.delete(); break;
			case '5' : score.writeAll(); break;
			case '6' : score.writeSort();break;
			case '7' : System.exit(0); break;
			
			}
			
			
		}
		
		
		
		
	}
}
