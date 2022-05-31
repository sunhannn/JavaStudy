package Study;

/*	1. 배열이란 크기와 성격이 같은 일연의 원소들이 모여 공동의 집합 구조를 갖는
 * 		자료의 집합체를 의미하는 것으로 동질적인 성격을 가진 자료들에 대해 개별적으로 
 * 		자료형을 부여하지 않고 하나의 이름을 가지고 처리할 목적으로 사용함.
 * 
 * 2.	자바에서의 배열을 다음과 같은 순서에 의해 사용된다.
 * 		1) 배열 선언 -> 2)	배열에 메모리 할당 ->	3) 배열 요소의 이용
 * 
 * 
 * 1차원 배열 형식 및 구조
 * 
 * 배열 선언
 * 자료형[] 변수명(배열명)
 * 변수명 = new 자료형[요소의 크기]
 * 변수명[인덱스] = 값
 * 
 */
public class Kayoubi01 {

	public static void main(String[] args) {
		
		//배열 선언
		int [] arr;
		
		//	메모리 할당
		arr = new int [10];
		
		//int arr [] = new int [10];
		
		//1.	배열은 선언과 동시에 초기화가 가능하다.
		//2. 메모리를 할당할 때도 초기화가 가능하다.
		
		//1. int arr [] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		// int [] arr =  {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		// 2. int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int a = 1;
		arr [0] = 1;
		arr [1] = 2;
		arr [a+1] = 3;
		//	이렇게 하면 나머지는 0으로 초기화 됨
		//	배열 요소 사용 (접근)
		//값을 할당하지 않은 나머지 배열 공간은 자동으로 초기화 된다. ->0
		
		
		//배열에 저장되어 있는 데이터(요소)의 값 출력
		System.out.println("arr[0] :"+arr[0]);
		System.out.println("arr[1] :"+arr[1]);
		System.out.println("arr[2] :"+arr[2]);
		System.out.println("arr[3] :"+arr[3]);
		
		
		// 반복문을 활용하여 배열에 저장된 데이터들을 출력함
		for ( int i = 0; i <10; i++)
			System.out.printf("%2d",arr[i]);
		
		System.out.println();
		
		for (int temp : arr)
			System.out.println(temp);
		
		
		
	}

}
