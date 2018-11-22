
public class Assign1 {

	public static void main(String[] args) {
		/*
		Write a JAVA program to calculate the tax:
			income ≤ 150,000,000 tax ratio %25
			income ≤ 300,000,000 tax ratio %30
			income ≤ 600,000,000 tax ratio %35
			income ≤ 1,200,000,000 tax ratio %40
			income > 1,200,000,000 tax ratio %50
			Create needed variables and print the tax 
*/
		System.out.println(calcTax(1_500_000_000));
	}

	public static double calcTax (long income) {
		double taxAmount;
		if(income>0 && income <=150_000_000) {
			taxAmount = income*25/100;
		}else if(income <=300_000_000) {
			taxAmount = income*30/100;
		}else if(income <=600_000_000) {
			taxAmount = income*35/100;
		}else if(income <=1_200_000_000) {
			taxAmount = income*40/100;
		}else {
			taxAmount = income*50/100;
		}
		
		return taxAmount;
	}
}

