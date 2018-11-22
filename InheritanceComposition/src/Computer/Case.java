package Computer;

public class Case {

	private String model;
	private String manufacturer;
	private String powerSupply;
	private Dimentions dimentions1;
	
	public Case(String model, String manufacturer, String powerSupply, Dimentions dimentions1) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimentions1 = dimentions1;
	}

	public void pressPowerButton () {
		System.out.println("Power button pressed");
	}
	
	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public Dimentions getDimentions1() {
		return dimentions1;
	}
	
	
	
}
