
//import java.util.Scanner;
//
//public class userInputScanner {
//
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
////		System.out.println("Enter a byte value ");
////		byte input = scanner.nextByte();
////				
////		System.out.println("Enter a short value");
////		short input2 = scanner.nextShort();
////		
//		System.out.println("Enter a integer value");
//		int input3 = scanner.nextInt();
////		
////		System.out.println("Enter a boolean value");
////		boolean input4 = scanner.nextBoolean();
////		
////		System.out.println(input+" | "+input2+" | "+input3+" | "+input4);
//		
//		System.out.println("What is your name?");
//		String str = scanner.next();
//		System.out.println(str);
//		scanner.close();
//		
//	}
//
//}

import java.util.Scanner;

public class userInputScanner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int count = 1;
		int sum = 0;
		while (count <= 10) {

			System.out.println("Enter a integer #" + count);
			boolean b1 = scanner.hasNextInt();

			if (b1) {
				int input = scanner.nextInt();
				sum += input;
				count++;
			} else {
				System.out.println("Invalid value");
			}
			scanner.nextLine();
		}
		System.out.println("Total of entered numbers are " + sum);
		scanner.close();

	}

}
