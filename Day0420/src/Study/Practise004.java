package Study;
	import java.io.*;
	
public class Practise004 {
	/*	사용자로부터 임의의 정수를 입력받아입력받은 정수가 양수인지, 음수인지, 0인지
	 * 판정하는 프로그램 구현
	 * 입력은 BufferedReader
	 * if or 상항연산자 활용
	 * 
	 * 임의의 년도를 입력받아입력받은 년도가 윤녕인지 평년인지를
	 * 판정하는 프로그램 구현
	 * - 년도가 4의 배수이면서 100의 배수가 아니거나
	 * 400의 배수이면 윤년 그렇지 않으면 평년
	 * 
	 */

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a;
		String s;
		
		System.out.println("임의의 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		
		// s = (n < 0) ? "음수":((n==0) ? "영":"양수");
		
		if(a > 0) {
			System.out.println("양수 입니다.");
		} else if (a == 0) {
			System.out.println("0입니다.");
		}else {
			System.out.println("음수입니다.");
		}
		
		

	}

}
