package com.Ex;
import java.util.*;
public class SungImpl extends Record implements Sung {
		int in;
		Record re[];
		
	
	
	
	
	@Override
	public void set() {	//인원 수 입력 받는 기능
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			do {
				System.out.println("인원수 입력 : ");
				in = sc.nextInt();
				
				
				
			}while(in < 1 || in > 100);
			re = new Record[in];
			
			re = new Record[in];
		
		
	}

	@Override
	public void input() {	// 학번, 이름, 과목별 점수 입력 기능, 판정
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[]title = {"국어 점수", "영어 점수", "수학 점수"};
		
		for (int i = 0; i < re.length; i++) {
			
			re[i] = new Record();
			System.out.printf("%d번째 학생의 학번 이름을 입력(공백 구분) : ",(i+1));
			re[i].number = sc.nextInt();
			re[i].name = sc.next();
			
			System.out.printf("국어 영어 수학 점수 입력(공백 구분) : " ,(i+1));
			re[i].sco[0] = sc.nextInt() ;//	국어 점수
					re[i].sco[1] = sc.nextInt(); //	영어 점수
					re[i].sco[2] = sc.nextInt() ;//	수학 점수
					
					// 각 과목별 판정 : 수(90점이상), 우(80점 이상), 미(70점 이상), 양(60점이상), 가(0~59)
					
			for (int j = 0; j<re[i].sco.length;j++) {
				if( re[i].sco[j]>= 90) {
				re[i].scor[j]	="수";
				}else if (re[i].sco[j]>=80) {	
					re[i].scor[j]	="우";
			
				}else if(re[i].sco[j]>=80) {
					re[i].scor[j]="미";
				}else if(re[i].sco[j]>=70) {
					
					re[i].scor[j]="양";
				}else if ( re[i].sco[j]>= 60) {
					re[i].scor[j]	="가";
				}
				re[i].sum = re[i].sco[0]+re[i].sco[1]+re[i].sco[2];
			}// end for
			
			
			
			re[i].avg = re[i].sum / 3.0;
			
			
			
			
				
			
			
		}
		
		
		
	}	
	

	@Override
	public void print() {	//결과 출력
		
		System.out.println("======성적표=======");
		for(int i = 0; i <re.length;i++) {
			
			System.out.printf("%5d %5s %3d %3d %3d %3d %3d %s\n",re[i].number,re[i].name,re[i].sco[0],re[i].sco[1],re[i].sco[2],re[i].sum,re[i].avg,re[i].scor[0]);
			for(int j = 0; j < 3; j++) {
				System.out.printf("\t\t %s %s %s\n",re[i].scor[0],re[i].scor[1],re[i].scor[2]);
				
			}
//			System.out.printf("%7d, %10.2f\n",re[i].sum,re[i].avg);
//			System.out.println();
			
		}
			
			
			
		}
		
		
	}
		
	
			

	

