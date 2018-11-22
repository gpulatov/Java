
public class ArithmeticOperators {

	public static void main(String[] args) {
		int i1 = 12;
		int i2 = 5;
		float f1 = 15.5f;
		double d1 = 20.5;
		String msg= "Hello";
		int res1 = i1+i2;
		float res2 = i1+f1;
		double res3= i2+ d1;
		String res4 = i1+msg;
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		
		System.out.println("==========================");
		
		//casting 
		byte b11 = 12; // implicit casting by JAVA
		int i11 = 12;
		byte b12 = 20;
		
		/*
		 *  
		 */
		byte resByte = (byte)(b11 +b12);
		System.out.println(resByte);
		byte b13 = 120, b14 = 16;
		byte res5 = (byte)(b13+b14);
		System.out.println(res5);
	}

}
