
public class Assign6 {

	public static void main(String[] args) {
		System.out.println(hasEqualSum(1, 5, 4));
		System.out.println(hasEqualSum(2, 8, 10));
		System.out.println(hasEqualSum(-11, 8, -3));
	}

	public static boolean hasEqualSum (int a, int b, int c) {
		if(a+b==c) {
			return true;
		}else {
			return false;
		}
	}
}
