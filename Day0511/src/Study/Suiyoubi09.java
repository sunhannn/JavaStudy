package Study;

public class Suiyoubi09 {

	public static void main(String[] args) {
		//	정수 45개 값을 저장할 배열 생성
		int [] lot = new int[45];
		
		for (int i = 0; i < lot.length;i++) {
			lot[i] =i+1;
		}
		int temp = 0;
		int j = 0;
		//	출력 6개
		for (int i = 0; i < 6;i++) {

			j = (int)(Math.random()*45);// 0~44
			
			
			
			temp = lot[i];
			lot [i] = lot [j];
			lot [j] = temp;
			System.out.printf("lot[%d] : %d\n", i, lot[i]);
		}
		
	}
}
