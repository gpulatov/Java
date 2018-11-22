
public class Car {

	private String color;
	private int maxSpeed;
	
	public void carInfo() {
		System.out.println("Car color: "+color+", Car maxSpeed: "+maxSpeed);
	}
	public Car(String color, int maxSpeed) {
	
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	public String getColor() {
		return color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	
}
