
public class Assign5 {

	public static void main(String[] args) {
		System.out.println(isLeapYear(-1600));
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(2017));
		System.out.println(isLeapYear(2000));
		System.out.println(isLeapYear(2100));
		System.out.println(isLeapYear(1996));
	}

	public static boolean isLeapYear(int year) {
		if (year < 1 || year > 9999) {
			return false;
		} else if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			return true;
		} else {
			return false;
		}
	}
}
