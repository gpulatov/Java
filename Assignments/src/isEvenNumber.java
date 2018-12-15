
public class isEvenNumber {

	public static void main(String[] args) {
		int num = 0;
		int count = 1;
		while (count < 6) {
			if (isEvenNumber(num) && num > 10 && num < 100) {
				System.out.println(num);
				count++;

			}
			num++;
		}

	}

	public static boolean isEvenNumber(int num) {

		if (num % 2 == 0) {
			return true;
		}

		return false;

	}

}
