
public class forEachLoop {

	public static void main(String[] args) {

		int[] marks = { 125, 132, 95, 116, 110 };
		int maxValue = maxNumInArray(marks);
		System.out.println(maxValue);

	}

	public static int maxNumInArray(int[] array) {
		int max = array[0];
		for (int elemOfArray : array) {
			if (elemOfArray > max) {
				max = elemOfArray;
			}
		}
		return max;
	}

}
