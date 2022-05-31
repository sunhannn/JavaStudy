package com.ex01;

import java.util.Scanner;
import java.util.*;
/*
 * Sung 클래스
 * - 인원수를 입력받아, 입력받은 인수 만큼 이름, 국어, 영어, 수학점수를 입력 받고
 * 	  총점과 평균, 석차를 구하는 프로그램을 작성하시오. (클래스 설계)
 * 
 * 	속성 : 인원수, Record 배열
 * 	기능 : 1.인원수 입력하는 기능
 * 			2. 데이터 입력하는 기능
 * 			3. 연산 처리하는 기능
 * 			4. 결과를 출력하는 기능
 */
public class Sung {

		// 주요변수 선언 (속성)
		int inwon; //인원수
		Record [] rec;	//Record []배열
		
		//	기능 (메소드)
		//	1. 인원수 입력
		public void set () {
			
			Scanner sc = new Scanner(System.in);
			
			do {
				System.out.println("인원 수 입력 (1~100) : ");
				inwon = sc.nextInt();
				
				
			}while(inwon < 1 || inwon > 100);
			rec = new Record[inwon];
			
			//Record	클래스의 배열 변수를 inwon만큼 생성한 것임.
			//Record 클래스의 인스턴스를 생성한 것은 아니다.
			rec = new Record [inwon];
		}
	
		//2. 상세 데이터 입력 및 연산 처리하는 기능.
		
		public void input() {
			Scanner sc = new Scanner(System.in);
			String [] title = {"국어 점수", "영어 점수", "수학 점수"};
			
			for (int i = 0; i <inwon; i++) {
				
			//인스턴스 생성 ( ***** 중요!)
			rec [i] = new Record();
			System.out.println((i+1)+"번 째 이름 입력");
		rec[i].name = sc.next();	//	next()와 nextLine()의 차이점은	next()는	토큰으로 구분 line은 전체적으로 구분
				
		
		for (int j = 0; j < title.length ;j++ ) {	//과목
			// 안내 메세지 출력
			System.out.println(title[j]);
			
			// 입력 받은 점수를 score 배열에 저장한다.
			rec[i].score[j] = sc.nextInt();
			
			
			//	점수를 반복적으로 입력받아 총점을 누적시켜 총점을 구한다.
			
			rec[i].tot += rec[i].score[j];
			
			
		}
		
		//  평균 계산
		rec[i].avg = rec[i].tot / 3.0;
				
			}
			
			
		}
	
	
		public void display() {
			System.out.println("=====학생 성적표=====");
			for (int i = 0; i < inwon; i++) {
				//이름 출력
				System.out.printf("%8s",rec[i].name);
				//국어, 영어, 수학 점수를 반복 출력
				for(int j = 0;j <3;j++) {
					System.out.printf("%5d",rec[i].score[j]);
					//평균, 총점 출력
					
					
				}
				System.out.printf("%7d, %10.2f\n",rec[i].tot,rec[i].avg);
				System.out.println();
				
			}
			
			
		}
		// 석차 메소드 추가
		public void ranking() {
			
			
			
			
		}
		
		
		
		
	
}
