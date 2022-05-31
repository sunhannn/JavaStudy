package Study;

public class Rensyuu01 {

	public static void main(String[] args) {
		

		int i, j;
		final int Max = 10;
		
		for (i=0; i <= Max; i++) {
		for (j = Max; j>=-Max; j--) {
			if (Math.abs(j)>i)System.out.println(" ");
			else System.out.printf("%d",Math.abs(j));
		}
		System.out.println();
		}
		
		
		
		
	}

}
