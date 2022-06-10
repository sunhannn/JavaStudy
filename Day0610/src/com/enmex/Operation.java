package com.enmex;

public enum Operation { // 추상클래스임
	
	PLUS {double eval(double x, double y){return x + y;}}, 
	MINUS{double eval(double x, double y){return x - y;}}, 
	TIMES{double eval(double x, double y){return x * y;}}, 
	DIVIDE{double eval(double x, double y){return x / y;}};
	
	
	abstract double eval(double x, double y);	
	
}
