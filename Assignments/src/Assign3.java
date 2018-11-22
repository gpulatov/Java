
public class Assign3 {

	public static void main(String[] args) {
		printMB_andKiloBytes(12000);

	}
	
	public static void printMB_andKiloBytes (int kiloBytes) {
		int remainKB = kiloBytes%1024;
		int MB = kiloBytes/1024;
		if(kiloBytes<0) {
			System.out.println("Invalid data!");
		}
		System.out.println(kiloBytes+" KB = "+MB+" MB and "+remainKB+"KB");
	}

}
 