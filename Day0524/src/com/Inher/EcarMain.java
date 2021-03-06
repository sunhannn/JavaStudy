package com.Inher;
/*		전기 자동차를 클래스로 작성해보자. 자동차는 완전(100%) 배터리로 시작한다.
 * 		자동차를 운전할 때마다 1km를 주행하고 배터리의 10%를 소모한다. 전기 자동차에는
 * 		2가지 정보를 보여주는 디스플레이가 있다. 주행한 총 거리는 " 주행거리 : ...km".
 * 		남은배터리 충전량은 "배터리 ...%"와 같이 표시된다.
 * 		
 */

public class EcarMain {
	
		private int batteryPercentage = 100;	//고정 값
		
		private int distance = 0;
	
	
	
		public static EcarMain getInstance() {
			
			//	 객체 반환
			EcarMain car = new EcarMain();
			return car;
			
		}
	
	
		public void dispDistance(){
			
	 System.out.println(distance+"킬로미터 주행...");
	 
		}
	
		public void dispBattery() {
				if (this.batteryPercentage == 0) {
					System.out.println("배터리가 없습니다.");
					return;
					
				}
				System.out.println("Battery : "+batteryPercentage);
		}
		
		public void drive() {
			
			if (this.batteryPercentage != 0) {
				this.distance += 1;
				this.batteryPercentage -= 10;
			}
			
		}
	
	public static void main(String[] args) {
			
//		EcarMain car = new EcarMain() ;
			EcarMain car = EcarMain.getInstance();
			car.drive();
			car.drive();
			car.drive();
		
		
			car.dispDistance();
			car.dispBattery();
		
		
		
		
		
		

	}

}
