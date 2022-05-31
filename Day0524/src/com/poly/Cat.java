package com.poly;

public class Cat  extends Animal{

	private String name;
	
	public Cat() {
		name = getClass().getSimpleName();
	}
	@Override
	public String scream() {
	
			return "야옹이요";
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
