package Study;

public class suiyoubi02 {
/*	문)
 *  -50 에서 1까지의 수를 출력하는 프로그램
 *  단, 한줄에 5개씩만 출력하고, 이 수들의 사이를 탭 간격으로 띄우시오.
 *  
 * 
 */
	public static void main(String[] args) {
		
		int i = -50;
		
		while (i <=1) {
			
			System.out.printf("%d\t",i);
			i++;
			if (i % 5 == 0)
				System.out.println();
		}
		
		
		
		
		
		

	}

}
