
public class Assign22Printer {
	
	private int tonerLevel;
	private int numPagesPrinted;
	
	public Assign22Printer(int tonerLevel, int numPagesPrinted) {
		
		this.tonerLevel = tonerLevel;
		this.numPagesPrinted = numPagesPrinted;
		
	}

	public int getTonerLevel() {
		return tonerLevel;
	}

	public int getNumPagesPrinted() {
		return numPagesPrinted;
	}
	
	public void fillUpToner () {
		if(getTonerLevel()==0) {
			tonerLevel++;
			tonerLevel*=100;
		}
	}
	public void pagesPrinted () {
		this.numPagesPrinted++;
	}
	
}
