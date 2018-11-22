
public class forLoop {

	public static void main(String[] args) {

		System.out.println("Interest amount based on interest rate is $"+calcInterest(10000, 2));
		
		System.out.println("==============================");
		
		for(int i=2; i<6; i++) {
			System.out.println("Interest amount based on interest rate is $"+calcInterest(10000, i));
		}
	}

	
	public static double calcInterest(double amount, double interestRate) {
		return amount * interestRate /100;
	}
}

/*
public class forLoop {

	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= 1000; i++) {

			if(i%3==0 && i%5==0) {
				sum+=i;
				System.out.println("System found number is " + i);
				count++;
				if(count==5) {
					break;
				}
			}
		}
		System.out.println(sum);
	}

}
*/