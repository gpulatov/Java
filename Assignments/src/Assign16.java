
public class Assign16 {

	public static void main(String[] args) {

		System.out.println(getEvenDigitSum(123456789));// should return 20 since 2+4+6+8=20.
		System.out.println(getEvenDigitSum(252)); // should return 4 since 2+2=4.
		System.out.println(getEvenDigitSum(-22));// -1
		System.out.println(getEvenDigitSum(111));// 0

	}

	public static int getEvenDigitSum(int number) {
		int sum = 0;
		if (number > 0) {
			while (number > 0) {
				int digit = number % 10;
				if (digit % 2 == 0) {
					sum += digit;
				} else {
					sum = 0;
				}
			}
			return sum;
		} else {
			return -1;
		}
	}

}
