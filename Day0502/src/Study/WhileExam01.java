package Study;

public class WhileExam01 {
/*
 * 	while문을 이용하여 구구단을 출력하시오.
 * 
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 2, j;//	 변수는 바깥 쪽에서 초기화 해야함
		
		while (i <= 9) {
			j=1;
			while (j <= 9) {
				System.out.printf("%d * %d = %d\n",i, j, (i*j));
				j++;
			}
			System.out.println();
			i++;
		}
		
		
		
		

	}

}
