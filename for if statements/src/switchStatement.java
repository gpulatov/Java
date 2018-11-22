
public class switchStatement {

//	public static void main(String[] args) {
//		
//		int switchValue = 3;
//		switch(switchValue) {
//		case 1:
//			System.out.println("value is 1");
//			break;
//		case 2:
//			System.out.println("value is 2");
//			break;
//		case 3: case 4: case 5:
//			System.out.println("value is 3 or 4 or 5");
//			break;
//		default:
//				System.out.println("value is not correct");
//		}
//
//	}
	
public static void main(String[] args) {
		
		char Char = 'D';
		
		switch(Char) {
		case 'A':
			System.out.println("A is found");
			break;
		case 'B':
			System.out.println("B is found");
			break;
		case 'C': case 'D': case 'E':
			System.out.println(Char+" is found");
			break;
		default:
				System.out.println("Char is not found");
		}

	}

}
