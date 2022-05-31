package Study;

public class Practise003 {

	public static void main(String[] args) {
		
		int a, sum = 0;
		int odd =0;
		int even = 0;
		
		for (a=0;a<=10;a++) {
			
			if (a % 2 ==0) {
				even = even + a;
				System.out.println(a+", "+even);
				
			}else {
				odd = odd+a;
				System.out.println(a+", "+odd);
				//continue;
			}
		}
		//sum = even + odd;
		
		

	}

}
