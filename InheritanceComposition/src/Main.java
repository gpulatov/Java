
public class Main {

	public static void main(String[] args) {
		
		Engine e1 = new Engine();
		Honda h1 = new Honda("Silver", 200, e1);
		
		h1.carInfo();
		h1.startHonda();
	}

}
