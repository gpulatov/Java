
public class Assign13 {

	public static void main(String[] args) {

System.out.println(sumOdd(1,100)); // should print 2500
System.out.println(sumOdd(-1,100)); // should print -1
System.out.println(sumOdd(100,100)); // should print 0
System.out.println(sumOdd(100,-100)); // should print -1
System.out.println(sumOdd(100,1000)); // should print 247500
		 
		
		

	}
	
	public static boolean isOdd (int num) {
		if(num < 0) {
			return false;
		}else if(num%2!=0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int sumOdd (int min, int max) {
		int sum = 0;
		for(int i=min; i<=max; i++) {
			if((max>0 && min>0) && min<=max) {
				if(isOdd(i)==true) {
					sum+=i;
				}
				
			}else {
				sum = -1;
			}
		}
		return sum;
	}

}
