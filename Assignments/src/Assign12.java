
public class Assign12 {

	public static void main(String[] args) {
	
		printNumberInWord(4);
	}
	
	public static void printNumberInWord (int num) {
		switch(num) {
		case 0: 
			System.out.println("ZERO");
			break;
		case 1: 
			System.out.println("ONE");
			break;
		case 2: 
			System.out.println("TWO");
			break;
		case 3: 
			System.out.println("THREE");
			break;
		case 9: 
			System.out.println("NINE");
			break;
		default:
			System.out.println("OTHER");
			break;	
		}
	}

}
