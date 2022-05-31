package Study;

public class Tvtest2 {

	public static void main(String[] args) {
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		
		
		System.out.println("t1의 현재 채널 값은"+t1.channel+"번 이다.");
		System.out.println("t1의 현재 채널 값은"+t2.channel+"번 이다.");
		
		t2 = t1;
		//	t1이 저장하고 있는 주소값을 t2에 저장한다.
		
		
		t1.channel = 7;	// 채널 7번으로 했다.
		System.out.println("t1의 현재 채널 값은"+t1.channel+"번 이다.");
		System.out.println("t1의 현재 채널 값은"+t2.channel+"번 이다.");
		
	
	}

}
