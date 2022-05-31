package Study;
import java.util.*;

public class Rensyuu001 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, e, sum, avg;
		
		
		char g;
		
		System.out.println("국어 점수를 입력하시오 : ");
		a = sc.nextInt();
		
		System.out.println("영어 점수를 입력하시오 : ");
		b = sc.nextInt();
		
		System.out.println("수학 점수를 입력하시오 : ");
		c = sc.nextInt();
		
		System.out.println("과학 점수를 입력하시오 : ");
		d = sc.nextInt();
		
		System.out.println("사탐 점수를 입력하시오 : ");
		e = sc.nextInt();
		
		sum = a+ b+ c+ d+ e;
		
	   avg = sum/5;
	   
	   System.out.printf("총 점수는 "+sum+" 이고, 평균은 "+avg+" 입니다.\n");
	   
	   	if(avg >= 90) {
	   		g = 'A';
	   	}else if (avg >=80) {
	   		g = 'B';
	   	}else if (avg >= 70) {
	   		g = 'C';
	   	}else if (avg >= 60) {
	   		g = 'D';
	   	}else {
	   		g ='F';
	   	}
		
		
		System.out.println("당신의 등급은 "+g+" 입니다.");

	}

}
