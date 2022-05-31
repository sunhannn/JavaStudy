package Study;
import java.io.IOException;
public class ImpEx001 {

	public static void main(String[] args) throws IOException{//예외 처리
		
		try {
		/*
		 *아스키 코드 값 입력 받기
		 *
		 * 0~9 : 48~57
		 * A~Z : 65~90
		 * a~z : 97~122
		 * 
		 */
		System.out.println("문자 입력: ");
		int i = System.in.read();
		System.out.println("ASCII Code 값 "+i);
			
		}catch(IOException e) {
			
		e.printStackTrace();
		
		}
		
		

	}

}
