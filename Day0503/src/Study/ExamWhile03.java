package Study;

public class ExamWhile03 {
/* 문)
 *  -1^2 + 2^2 - 3^2 + 4^2 - 5^2 +..... + 100^2 의 합계를 구하는 프로그램을 작성하시오.
 * 
 */
	public static void main(String[] args) {
		int n = 1, sum=0;
		int simbol =1;
		/*while(true) {
			if(n % 2 == 1 && n<=100) {
			sum =-(n*n);
			n++;
			}else {
				simbol = n*n;
				n++;
			}if(n == 100) {
				break;
				
			}
			
		}
		System.out.println("합계 : "+(sum+simbol));
		*/
		
		while (n<=100) {
			//if ( n % 2 != 0) {
				simbol = -simbol;
				
				sum +=simbol*(n*n);
				n++;
			//}
		
		}
		
		System.out.println(sum);
	}

}
