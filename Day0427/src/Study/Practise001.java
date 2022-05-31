package Study;

public class Practise001 {
	/*	1에서 부터 10까지의 합계를 구한다.
	 * 
	 * 1+2+3+4+5+6+8+9+10
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		//1부터 10까지 반복 처리하는 변수
		int i;
		//반복 처리하면서 누적합계를 저장하는 변수
		int sum = 0;
		
		for (i=1;i<=10;i++) {
			System.out.println(i);
			sum =sum+1;
			System.out.println(i+", "+sum);
			
		}
		
		

	}

}
