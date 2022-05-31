package Study;

public class Kinyoubi01 {

	public static void main(String[] args) {
		
		//int [][] score = new int [5][];
		//	 행은 5개 열은 3개
		/*score [0] = new int [2];	//	초기 값을 새로 잡아줘야함  99,92
		score [1] = new int [4];//78, 48, 78,98
		score [2] = new int [3];	//	열의 값 넣기  95,92,30
		score [3] = new int [5];	//37,98,23,21,19
		score [4] = new int [3];//29 , 64, 83
		*/
		
		int [][] score  = {
				{99,92},
				{78,48,78,98},
				{95,92,30},
				{37,98,23,21,19},
				{29,64,83}
		};
		
		
		int sum = 0;
		
		for (int i = 0; i < score.length;i++) {	//sum은 라인이 바뀔때마다 초기화
			sum = 0;
			for(int j = 0; j < score[i].length;j++) {
				sum += score[i][j];
				System.out.print(score[i][j]+"   ");
			}
			//System.out.println();
			System.out.printf("합계 : %d, 평균 : %2f\n",sum,(double)(sum/score[i].length));
		}
		
		
		
		
		
		
		
		

	}

}
