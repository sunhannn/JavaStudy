package Study;
import java.util.*;

public class Practise001 {
	/*	5개의 과목을 점수를 입력받아 총점과 평균을 구하고 평균을 이용하여
	 * 학점을 판정하는 프로그램을 구현하시오.
	 * 학점 A의 점수는 90점 이상
	 * B 	80
	 * C	70
	 * D	60
	 * F	60미만
	 */
	



	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int guk, eng, su, sci, sa,sum ,avg;
		
		char  hak;
		
		System.out.println("국어 점수를 입력하시오 : ");
		guk = sc.nextInt();
		
		System.out.println("영어 점수를 입력하시오 : ");
		eng = sc.nextInt();
		
		System.out.println("수학 점수를 입력하시오 : ");
		su = sc.nextInt();
		
		System.out.println("과학 점수를 입력하시오 : ");
		sci = sc.nextInt();
		
		System.out.println("사회 점수를 입력하시오 : ");
		sa = sc.nextInt();
		
		sum = guk + eng + su + sci + sa;
		
		System.out.printf("총 점수는 "+sum+" 입니다.\n");
		
		avg = sum/5;
		
		System.out.printf("전체 평균은 "+avg+" 입니다.");
		
		
		
		if(avg >= 90) {
			hak = 'A';
		}else if(avg >= 80) {
			hak = 'B';
		}else if(avg >= 70) {
			hak = 'C';
		}else if(avg >= 60) {
			hak = 'D';
			
			
		}else {
			hak = 'F';
		}
		
		
		
		
		

	}

}
