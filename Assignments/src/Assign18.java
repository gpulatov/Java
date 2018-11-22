import java.util.Arrays;
import java.util.Scanner;

public class Assign18 {

	public static void main(String[] args) {
		int[] myArray = getIntegers(6);
		System.out.println(Arrays.toString(myArray));
		Arrays.sort(myArray);
		System.out.println(Arrays.toString(myArray));
		int[]sortedArray = descSortedArray(myArray);
		System.out.println(Arrays.toString(sortedArray));
		
	}

	public static int[] getIntegers(int num) {
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
	public static int[]descSortedArray (int[]arr) {
		int[]descSortedArray= new int[arr.length];
		int j = 0; 
		for(int i= arr.length-1; i>=0; i--) {
			descSortedArray[j]=arr[i];
			j++;
		}
		return descSortedArray;
	}

}
