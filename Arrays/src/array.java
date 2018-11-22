import java.util.Arrays;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {

//		int[] myIntArr = new int[10];
//		myIntArr[0] = 35;
//		myIntArr[1] = 21;
//		
//		int[]arr2 = new int[]{1,25,30,4,8};
//		
//		System.out.println(myIntArr[2]+ " | "+arr2[4]);
		
		int[] myArray = arr(5);
		System.out.println("The average of myArray elements is "+getAverage(myArray));
		System.out.println(Arrays.toString(myArray));
	}

	public static int[] arr(int num) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter your " + (i + 1)+" element");
			int input = scanner.nextInt();
			array[i] = input;
		}
		scanner.close();
		return array;
		
	}

	public static double getAverage(int[] array) {
		int sum = 0;
		double avg;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return avg = sum / array.length;
	}

}
