
public class Honda extends Car {
	
	private Engine engineOfCar;
	
	public Honda(String color, int maxSpeed, Engine engineOfCar) {
		super(color, maxSpeed);
		this.engineOfCar = engineOfCar;
		
	}
	
	public void startHonda () {
		engineOfCar.start();
	}
	
	
}
