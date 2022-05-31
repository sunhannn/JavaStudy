package Study;
// Arrays.toString()
//	toString() : 배열의 모든 요소 [첫번 째 요소, ~]의 값들의 문자열 형식으로 만들어서 변환함
import java.util.*;

public class Suiyoubi02 {

	public static void main(String[] args) {
		
		int [] iArr1 = new int [10];
		int [] iArr2 = new int [6];
		int [] iArr3 = new int [] {100,95,80,70,60};
		int [] iArr4 = {100,95,80,70,60};
		char [] chArr = {'a', 'b', 'c', 'd'};
		// 이 클래스에는 배열이 총 6개다.
		
		//	iArr1의 배열에 1~10까지 순서대로 저장함
		for (int i = 0 ; i < iArr1.length ; i++) {
			iArr1[i] = i+1;
			System.out.print(iArr1[i]+"\t");
		}
		System.out.println();
		for (int i = 0; i<iArr2.length ; i++) {
			iArr2 [i] =(int) (Math.random()*45)+1; //배열은 자료형이 비슷해야함
			System.out.print(iArr2[i]+"\t");
		}
		System.out.println();
		for (int i = 0; i <iArr3.length ; i++) {
			System.out.print(iArr3[i]+"\t");
		}
		System.out.println();
		System.out.println(Arrays.toString(iArr2));
		
	}

}
