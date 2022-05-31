package Study;
import java.util.Scanner;

public class Practise002 {
//수능 점수를 입력하면 점수의 합과 평균을 구하게 만들기(스캐너 사용)
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int g = 0;
		int s = 0;
		int y = 0;
		int t = 0;
		int sum = 0;
		int average = 0;
		
		System.out.println("국어 영역 점수 : ");
		System.out.println("수리 영역 점수 : ");
		System.out.println("영어 영역 점수 : ");
		System.out.println("탐구 영역 점수 : ");
		
		g = Integer.parseInt(sc.next());
		
		s = Integer.parseInt(sc.next());
		
		y = Integer.parseInt(sc.next());
		
		t = Integer.parseInt(sc.next());
		
		sum = g + s + y+t;
		average = sum/4;
		
		System.out.println("수능 점수는 총 "+sum+" 점 입니다.");
		
		System.out.println("수능 점수의 평균은 "+average+"점 입니다.");
		
				
		
		
		
		
		
		
	}

}
