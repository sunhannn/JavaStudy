package Gawa;

public class tora extends doubutu {

	private String name;
	
	public tora() {
		name = getClass().getSimpleName();
		
	}
	@Override
	public String scream() {
		// TODO Auto-generated method stub
		return "어흥이요";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
}
