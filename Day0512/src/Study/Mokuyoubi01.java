package Study;

public class Mokuyoubi01 {

	public static void main(String[] args) {
		
		//	2차원 배열의 선언과 초기화
		/*	방법  1.
		int [][] arr1 = new int [3][3];
				
				
		arr1[0][0] = 1;
		arr1[0][1] = 1;
		arr1[0][2] = 1;ㄱ
		*/
		int[][]arr2 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		//출력
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {//두번째 변수를 넣을때, [i]를 넣어주어야함
				System.out.printf("%2d",arr2[i][j]);
			}
			System.out.println();
			}
		int [][] arr3 = new int[3][3];
		int n =1;
		
		for (int i = 0; i <arr3.length;i++) {
			arr3[i][0]=n;
			n++;
		}
		
		
	}

}
