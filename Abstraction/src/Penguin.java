
public class Penguin extends Bird{

	public Penguin(String name) {
		super(name);
	}

	@Override
	public void fly() {
		System.out.println("Pengiun cannot fly, but can swim instead of fly");
	}
	
	

	
}
