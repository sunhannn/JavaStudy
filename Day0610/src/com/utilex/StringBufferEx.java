package com.utilex;
/*
 *  버퍼란?
 *  	-  버퍼는 데이터를 한곳에서 다른 한곳으로 전송하는 동안 일시적으로 그데이터를
 *   	보관하는 메모리의 영역을 의미함(임시메모리공간)
 *   버퍼링이란
 *    - 버퍼를 채우는 동작을 의미함
 *    
 * 
 * 
 */

import java.io.*;

public class StringBufferEx {

	public static void main(String[] args) throws IOException {
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("문자열입력 : ");
		String str = br.readLine(); // 계속 버퍼에 저장함
		*/
		
		StringBuffer sb = new StringBuffer("JAVA");
		//System.out.println(sb);
		//System.out.println(sb.capacity());
		sb.append("1.8");	//추가
		System.out.println(sb);
		sb.delete(3, 5);// 3에서 5까지 삭제
		System.out.println(sb);
		sb.insert(3, "A1"); // 3에다가 A1삽입
		System.out.println(sb);
		sb.replace(4, 7, "일점팔");// 4에서 7까지 수정
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

}
