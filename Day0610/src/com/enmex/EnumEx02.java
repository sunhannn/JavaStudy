package com.enmex;

public class EnumEx02 {

	public static void main(String[] args) {
		// 랩퍼 클래스
		double x = Double.parseDouble("10.2");
		double y = Double.parseDouble("20.0");
		
		System.out.println(Operation.PLUS.eval(x, y));
		
		for (Operation op : Operation.values()) {
			System.out.printf("%1f %s %1f = %1f%n",x, op, y, op.eval(x, y));
		}
		
	}

}
