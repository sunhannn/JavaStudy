package Gawa;

public class inu extends doubutu {

	private String name;
	
	public inu() {
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
