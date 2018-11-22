
public class Assign14 {

	public static void main(String[] args) {

		System.out.println(isPalindrome(-1221));
		System.out.println(isPalindrome(707));
		System.out.println(isPalindrome(11212));
		System.out.println(isPalindrome(1123553211));
	}

	public static boolean isPalindrome(int number) {
		int num;
		if (number < 0) {
			num = -number;
		} else {
			num = number;
		}
		int reverse = 0;
		int lastDigit;
		while (num > 0) {
			lastDigit = num % 10;
			num /= 10;
			reverse = reverse * 10 + lastDigit;
		}
		if (reverse == number || reverse == -number) {
			return true;
		} else {
			return false;
		}
	}
}
