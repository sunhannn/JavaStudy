package Tanpopo;
import java.io.*;
public class HataEx {

	public static void main(String[] args) throws IOException {
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		
			Hata ha = new Hata("한상현");
		
		
		String strWork;
		

		
		do {
			System.out.println("\n작업을 선택하세요");
			System.out.println("=================");
			System.out.println("입    금 ============> 1");
			System.out.println("출    금 ============> 2 ");
			System.out.println("잔 액 조 회 ===========> 3");
			System.out.println("종      료 =============> 0");
			
			System.out.println("작업 내용을 선택하세요 : ");
			strWork = br.readLine();
			
			int switchInt = 0;
			
			if (strWork != null) {
				switchInt = Integer.parseInt(strWork);
				
				
				
				
			}else {
				System.out.println("작업 내용을 입력하지 않으셨습니다.");
				System.exit(0);
				
				
			}
			switch(switchInt) {
			
			case 0:
				System.out.println("프로그램을 종료 합니다.");
				break;
			case 1:
				System.out.println("\n ====================");
				System.out.println("입금하실 금액을 입력하세요 : ");
				String strdepositIn = br.readLine();
				long depositLong = Long.parseLong(strdepositIn);
				ha.deposit(depositLong);
				break;
				
			case 2:
				System.out.println("\n ======================");
				System.out.println("출금하실 금액을 입력하세요");
				String strwithdrawIn = br.readLine();
				long strwithdrawLong = Long.parseLong(strwithdrawIn);
				ha.withdraw(strwithdrawLong);
				break;
			
			case 3:
				System.out.println(ha.getName()+"님의 잔고는 "+ha.getBalance()+"원 입니다.");
				break;
				default :
					System.out.println("0 ~ 3 사이 숫자를 입력하세요");
					break;
				
				
			
			}
			
			
		}while(!strWork.equals("0"));
		
		
		
	}

}
