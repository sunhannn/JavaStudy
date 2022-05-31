package Study;

public class Tvtest{
	public static void main(String[] args) {
		// 인스턴스를 참조하기 위한 변수 t를 선언했다.
		Tv t;
		t = new Tv(); //인스턴스를 생성했다.(인스턴스 = 객체)
		
		
		t.channel = 24;	// 객체의 멤버변수 채널 값을 24로 지정했다.
		t.channelDown();//23 : 연합뉴스
		System.out.println("현재 채널은 "+t.channel+"입니다.");
		
		
	}
/*
	@Override
	public void void channelUp() {
		super.channelDown();
		*/
		
	
	
	
}
