package Computer;

public class Main {

	public static void main(String[] args) {
		
		Dimentions theDimentions = new Dimentions(20, 20, 5);
		Case theCase = new Case("2208", "Dell", "240", theDimentions);
		Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
		Monitor theMonitor = new Monitor ("27 inc beast", "Aser", 27, new Resolution(2540, 1440));
		
		PC thePC = new PC(theCase, theMonitor, theMotherboard);
		
		thePC.getTheMonitor().drawPixelAt(1500, 1200, "red");
		
		thePC.getTheMotherboard().loadProgramm("Windows 1.0");
		
		thePC.getTheCase().pressPowerButton();
	}
	
		

}