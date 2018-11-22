
public class calculateSum {

	public static void main(String[] args) {
//		calculateSum(4, 5);
//		System.out.println(calculateSum2(20, 10));
		
		displayHighScorePosition("Mark", calPosition(500));
		displayHighScorePosition("Mike", calPosition(1000));
		displayHighScorePosition("Timothy", calPosition(400));
	}
	
	public static void displayHighScorePosition (String name , int position) {
		System.out.println(name+" managed to get into position " + position);
	}
	
	public static int calPosition (int score) {
		int rank;
		if(score>=1000) {
			rank = 1;
		}else if(score>=500 && score < 1000) {
			rank = 2;
		}else if(score >=100 && score < 500) {
			rank = 3;
		}else {
			rank = 4;
		}
	return rank;
	}
	
//	public static void calculateSum(int a, int b) {
//		int sum = a+b;
//		System.out.println(sum);
//	}
//	
//	
//	public static int calculateSum2(int x, int y) {
//		int sum = x+y;
//		return (byte)sum;
//	}

}

