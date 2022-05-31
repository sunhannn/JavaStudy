package StarEx;

public class Nami {
	
		private int batteryPercentage = 100;
		
		private int distance = 0;
		
		
		public static Nami getInstance() {
			
			Nami car = new Nami();
			return car;
			
			
		}
	
		public void dispDistance() {
			
			System.out.println(distance+"킬로미터 주행...");
			
		}
		
		public void dispBattery() {
			if(this.batteryPercentage == 0) {
				System.out.println("배터리가 없습니다.");
				return;
			}
			System.out.println("Battery : "+batteryPercentage);
			
		}
		public void drive() {
			
			if(this.batteryPercentage != 0) {
				this.distance += 1;
				this.batteryPercentage -= 10;
				
			}
			
			
		}
		
		
	public static void main(String[] args) {
		
		Nami car = Nami.getInstance();
		car.drive();
		car.drive();
		car.drive();
		
		
	
		
		car.dispBattery();
		car.dispDistance();
		
	}

}
