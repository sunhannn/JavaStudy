package Study;

import java.util.Scanner;

public class TestWW {
	//세과목 국어, 영어, 수학
	// 문제) 위의 세과목의 점수를 입력받아 총점과 평균을 출력
	//평균은 소수 2자리까지(입력 스캐너)
	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int l = 0;
		int e = 0;
		int m = 0;
		int sum = 0;
		double average = 0;
		
		System.out.println("국어 점수 입력 : ");
		
		System.out.println("영어 점수 입력 : ");
		
		System.out.println("수학 점수 입력 : ");
		
		l = Integer.parseInt(sc.next());
		
		e = Integer.parseInt(sc.next());
		
		m = Integer.parseInt(sc.next()); //문자로 입력됨
		
		System.out.println(l);
		System.out.println(e);
		System.out.println(m);
		

		sum = l + e + m;
		average = sum/3.0f;
		
		
	
		System.out.printf("세과목의 평균은 : %.2f이고, 총점은 %d입니다.",average,sum);

		sc.close();
		
	}

}
