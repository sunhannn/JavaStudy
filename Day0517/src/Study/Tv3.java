package Study;

public class Tv3 {

	public static void main(String[] args) {
		Tv[] tv;	//객체 배열 선언
		// = int[] arr;
		
		tv = new Tv[5];
		
		
		for (int i = 0; i < tv.length;i++) {
			tv[i]= new Tv();
			tv[i].channel = i+10;	//	tv[i]의 채널에 i+10을 저장함
			
			System.out.println(tv[i].channel);
		}
		
		for (int i = 0; i < tv.length;i++) {
			tv[i].channelUp();	//tv[i].channelUp() 메소드를 호출하여 채널을 1증가
			
			System.out.printf("tv[%d].channel=%d\n",i,tv[i].channel);
		}
		
		
		
		

	}

}
