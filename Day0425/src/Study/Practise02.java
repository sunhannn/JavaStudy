package Study;
import java.io.*;

public class Practise02 {
	/* 임의의 5개 과목을 점수를 입력받아 총점과 평균을 구하고
	 * 평균을 이용하여 학점을 판정하는 프로그램 구현
	 *	switch ~ case 문과 BufferedReader를 이용하여 구현 하시오
	 */

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, c, d, e;
		
		int sum, avg;
		System.out.println("과목 1 입력 : ");
		a = Integer.parseInt(br.readLine());
		
		
		System.out.println("과목 2 입력 : ");
		b =  Integer.parseInt(br.readLine());
		
		System.out.println("과목 3 입력 : ");
		c =  Integer.parseInt(br.readLine());
		
		System.out.println(" 과목 4 입력 : ");
		d = Integer.parseInt(br.readLine());
		
		System.out.println("과목 5 입력 : ");
		e = Integer.parseInt(br.readLine());
		
		sum = a + b + c + d + e;
		
		avg = sum/5;
		
		char g=0;
		
				
		switch ((int)(avg/10)) {
		
		case 9:
			
		g= 'A';
			break;
		case 8:
		g = 'B';
			break;
		case 7:
		g = 'C';
			break;
		case 6:
		g = 'D';
			break;
		default:
		g='F';
			
		}
		
		
		System.out.println("학점은 "+g+" 입니다.");
		
		
		
		

	}

}
