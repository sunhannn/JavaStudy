package Study;
import java.util.*;

public class Botan01 {

	public static void main(String[] args) {
		
	int [] iArr1 = new int [10];
	int [] iArr2 = new int [6];
	int [] iArr3 = new int [] {100, 95, 80, 70, 60};
	int [] iArr4 = {100, 95, 80, 70, 60};
	char [] chArr = {'a', 'b', 'c', 'd'};
		
		
		for (int i = 0; i < iArr1.length;i++) {
			iArr1[i] = i+1;
			System.out.print(iArr1[i]+"\t");
			
		}
		System.out.println();
		for (int i = 0; i < iArr2.length;i++) {
			iArr2[i] = (int)(Math.random()*45)+1;
			System.out.print(iArr2[i]+"\t");
		}
		
		System.out.println();
		for (int i = 0; i <iArr3.length;i++) {
			System.out.println(iArr3[i]+"\t");
		}
		System.out.println();
		System.out.println(Arrays.toString(iArr2));
		
		
	}

}
