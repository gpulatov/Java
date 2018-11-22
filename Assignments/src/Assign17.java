import java.util.Scanner;

public class Assign17 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int min = 0;
		int max = 0;
		while (true) {
			System.out.println("Enter a number");
			boolean b1 = scanner.hasNextInt();

			if (b1) {
				int input = scanner.nextInt();
				if (input > max) {
					max = input;
				} else if (input < min) {
					min = input;
				}
			} else {
				System.out.println("Invalid value");
				break;
			}
			scanner.nextLine();
		}
		System.out.println("Minimum number was: " + min + " maximum was: " + max);
		scanner.close();

	}
}
