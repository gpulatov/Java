import java.util.Scanner;

public class Assign19 {

	public static void main(String[] args) {

		int[] myArray = readIntegers(4);
		int minValueOfArray = findMin(myArray);
		System.out.println(minValueOfArray);
	}

	public static int[] readIntegers(int count) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[count];
		for (int i = 0; i < count; i++) {
			System.out.println("Enter your " + (i + 1) + " element");
			int input = scanner.nextInt();
			array[i] = input;
		}
		scanner.close();
		return array;
	}

	public static int findMin(int[] arr) {
		int min = arr[0];
		for (int elemOfArray : arr) {
			if (elemOfArray < min) {
				min = elemOfArray;
			}
		}
		return min;
	}

}
