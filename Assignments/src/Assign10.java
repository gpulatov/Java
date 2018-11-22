
public class Assign10 {

	public static void main(String[] args) {

		yearsAndDays(525600);
		yearsAndDays(1_051_200);
		yearsAndDays(561600);

	}

	public static void yearsAndDays(long minutes) {
		if (minutes < 0) {
			System.out.println("Invalid Value");
		}

		int day = (int) (minutes / 1440);
		int year = day / 365;
		int remainDay = day % 365;

		System.out.println(minutes + " min = " + year + " y and " + remainDay + " d");
	}

}
