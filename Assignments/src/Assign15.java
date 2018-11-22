
public class Assign15 {

	public static void main(String[] args) {
		
		System.out.println(sumFirst_Last_Digit(252));
		System.out.println(sumFirst_Last_Digit(257));
		System.out.println(sumFirst_Last_Digit(0));
		System.out.println(sumFirst_Last_Digit(5));
		System.out.println(sumFirst_Last_Digit(-10));

	}

	public static int sumFirst_Last_Digit(int number) {
		int num = number;
		int firstDigit = 0;
		while (num > 0) {
			firstDigit = num%10;
			num/=10;
		}
		if(number>=0) {
			int lastDigit = number%10;
			return firstDigit+lastDigit;
		}else {
			return -1;
		}
	}

}
