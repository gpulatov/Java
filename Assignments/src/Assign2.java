
public class Assign2 {

	public static void main(String[] args) {
		System.out.println(isCatPlaying(true, 10));//false
		System.out.println(isCatPlaying(false, 36));//false
		System.out.println(isCatPlaying(false, 35));//true
		System.out.println(isCatPlaying(false, 35));//true
		System.out.println(isCatPlaying(false, 22));//false
		System.out.println(isCatPlaying(true, 46));// false

	}
	
	public static boolean isCatPlaying (boolean summer, int temp) {
		
		if(summer && temp>25 && temp<=45) {
			return true;
		}else if(summer==false && temp>25 && temp<=35) {
			return true;
		}else {
			return false;
		}
	}
}
