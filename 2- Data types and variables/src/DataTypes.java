
public class DataTypes {

	public static void main(String[] args) {

		// byte
		byte b1 = 25;
		byte b2 = -128;
		byte b3 = 127;
		System.out.println(b1 + "|" + b2 + "|" + b3);

		System.out.println("--------------------------");

		// short

		short s1 = 500;
		short s2 = -32768;
		short s3 = 32767;
		System.out.println(s1 + "|" + s2 + "|" + s3);
		
		
		System.out.println("--------------------------");

		// int

		int i1 = -50000;
		int i2 = 100_000;
		int i3 = 50000;
		System.out.println(i1 + "|" + i2 + "|" + i3);
		
		// long
		long l1 = -500_000_000;
		long l2 = 100_000_000_000L;
		
		System.out.println(l1 + "|" + l2);
		
		//float 
		float f1 = 5.2f;
		double d1 = 5.2;
		System.out.println(f1 + "|" +d1);
		
		//char
		
		char c1 = 'a';
		char c2 ='A';
		System.out.println(c1 +"|"+ c2);
		System.out.println(c1);
		
	}

}
