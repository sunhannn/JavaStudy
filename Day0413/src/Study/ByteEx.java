package Study;

public class ByteEx {

	public static void main(String[] args) {
		

		/*
		 * byte : 1byte 자료형 (-128~127)256 
		 * 
		 * 
		 *boolean : 유일한논리자료형
		 *1byte크기지만 1비트만 사용한다.
		 *가지는 값은 true,false
		 *
		 * 
		 */
		
		byte bb =126;
		//128을 넘어가면 컴파일러에서 저지를 한다.,하지만 C언어에서는 127로 인식한다.
		
		bb++;
		System.out.println("byte bb: "+bb);
		
		boolean b = true;
		boolean a = false;
				
		System.out.println("변수 b의 값은 :"+b",a :"+a);
		
		
		
		
		
		
		
	}

}
