import java.util.Scanner;

public class find_Min_Max_ScannerUse {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int count = 1;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		while (true) {

			System.out.println("Enter a integer #" + count);
			boolean isAnInteger = scanner.hasNextInt();
			count++;
			if (isAnInteger) {
				int num = scanner.nextInt();
				if (num > max) {
					max = num;
				}
				if (num < min) {
					min = num;
				}
			} else {
				System.out.println("Invalid value");
				break;
			}

		}

		System.out.println("Total of entered numbers are " + count);
		System.out.println("Min number is: " + min + " and max number is: " + max);
		scanner.close();

	}

}
