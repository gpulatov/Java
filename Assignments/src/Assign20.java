import java.util.Arrays;

public class Assign20 {

	public static void main(String[] args) {
		int[] arr2 = { 1, 25, 30, 4, 8 };
		reverse(arr2);
	}
	
	

	public static void reverse(int[] arr) {
		int[]reversedArray = new int[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			reversedArray[j] = arr[i];
			j++;
		}
		System.out.println(Arrays.toString(reversedArray));
	}

}