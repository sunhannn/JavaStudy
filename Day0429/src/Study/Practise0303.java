package Study;

public class Practise0303 {

	public static void main(String[] args) {
		
		int a, b;
		
		for (a = 1; a<=5; a++) {
			
			for (b = 1;b<=5;b++) {
				if(a==b) {
					System.out.printf("(%d, %d)", a, b);
				}else {
					System.out.printf("  ");
				}
				//(a == b) ? (a, b):" ";
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		

	}

}
