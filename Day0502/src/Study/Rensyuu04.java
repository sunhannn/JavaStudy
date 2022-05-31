package Study;
import java.util.*;
public class Rensyuu04 {
/*
 *  국어, 영어, 수학점수를 입력받아 총점과 평균 그리고 학점을 구하는 프로그램을 작성
 *  학점 : 100 ~ 90 = A, 60점이하는 F로 처리
 *  평균은 소수점이하 2자리 까지 표시
 * 단, 각 과목을 점수는 0 ~ 100을 벗어나지 못함
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int guk, eng, su = 0;
		int sum =0;
		char hak = 0;
		float avg = 0.0f;
		
		do {
		System.out.println("국어 점수 입력 : ");
		guk = sc.nextInt();
		}while(guk<0 || guk > 100);
		
		do {
		System.out.println("수학 점수 입력 : ");
		su = sc.nextInt();
		}while(su < 0 || su > 100);
		
		do {
		System.out.println("영어 점수 입력 : ");
		eng = sc.nextInt();
		}while(eng < 0 || eng > 100);
		
		sum = guk + su + eng;
		
		avg = sum/3.0f;
		//System.out.printf("평균 : %.2f\n"+avg);
	
		switch ((int)(avg/10)) {
		
		case 10:
		case 9:
			hak = 'A';
			break;
		case 8:
			hak = 'B';
			break;
		case 7:
			hak = 'C';
			break;
		case 6:
			hak = 'D';
			break;
			default :
				hak = 'F';
				
		}
		
		System.out.println("학점은 : "+hak);
		
		
	}

}
