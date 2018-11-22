
//public class whileLoop {
//
//	public static void main(String[] args) {
//	System.out.println(sumDigits(125));
//	System.out.println(sumDigits(12005));
//	System.out.println(sumDigits(1505));
//	}
//
//	public static int sumDigits(int num) {
//		if(num<10) {
//			return -1;
//		}
//		
//		int sum=0;
//		while(num>0) {
//			int digit = num%10;
//			sum = sum + digit;
//			num = num/10;
//		}
//		return sum;
//	}
//}

public class whileLoop {

	public static void main(String[] args) {
	System.out.println(sumDigits(125));
	System.out.println(sumDigits(12005));
	System.out.println(sumDigits(1505));
	}

	public static int sumDigits(int num) {
		if(num<10) {
			return -1;
		}
		
		int sum=0;
		int i =0;
		String numberToString = Integer.toString(num);
		String[] stringNum = numberToString.split("");
		while(stringNum.length>i) {
			sum+=Integer.parseInt(stringNum[i]);
			i++;
		}
		return sum;
	}
}