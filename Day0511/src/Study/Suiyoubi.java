package Study;

public class Suiyoubi {

	public static void main(String[] args) {
		
		
		//int []	score = new int [5];
		int [] score;
		score = new int [5];
		  int j =1;
		  
		score [0] = 10;
		score [1] = 10;
		score [j+1] = 10;
		score [3] = 10;
		score [4] = 10;
		
		
		//System.out.println(score); 
		//	배열은 위치값을 저장한다. 즉, 4바이트 5개를 잡앗으니 20바이트
			int sum = score [0] + score [1] +score [2] +score [3] +score [4];
			sum=0;
			
			
			for (int i = 0 ; i <score.length ; i++) {
			sum = sum + score[i];	//배열에는 그냥 변수가 아닌 배열 변수를 넣어야 한다.
			
			}
				
			System.out.println(sum);
			
			for (int i = 0 ; i <score.length ; i++) {
			System.out.printf("score[%d]:%2d\n",i,score[i]);
			//배열 하나씩 출력하기
			
			}

	}

}
