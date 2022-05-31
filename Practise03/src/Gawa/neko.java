package Gawa;

public class neko extends doubutu {
	
	private String name;
	
	public neko() {
		
		name = getClass().getSimpleName();
				
		
	}
	
	@Override
	public String scream() {
		// TODO Auto-generated method stub
		return "야옹이요";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
