import java.util.Scanner;

public class Main {

	private static Scanner input = new Scanner(System.in);
	private static GroceryList grocerylist1 = new GroceryList();

	public static void main(String[] args) {

		boolean exitLoop = false;
		int choice = 0;
		printInstructions();
		while(!exitLoop) {
			System.out.println("Enter your choice:");
			choice = input.nextInt();
			input.nextLine();
			
			switch(choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				grocerylist1.printInstructions();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchItem();
				break;
			case 6:
				exitLoop = true;
				break;
			}
			
		}
	}

	private static void printInstructions() {
		// here we should create one method ourselves
		
	}

}
