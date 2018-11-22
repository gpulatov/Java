
public class Assign8 {

	public static void main(String[] args) {
		System.out.println(getDurationString(6850));
		System.out.println(getDurationString(135, 57));
	}

	public static String getDurationString(int minutes, int seconds) {
		if (minutes < 0 || (seconds < 0 && seconds > 59)) {
			return "Invalid Value";
		}
		int hour = minutes / 60;
		int remain = minutes % 60;
		return hour + "h " + remain + "m " + seconds + "s";
	}

	public static String getDurationString(int seconds) {
		if (seconds < 0) {
			return "Invalid Value";
		}
		
		int minutes = seconds/60;
		int remainSec = seconds%60;
		System.out.println(minutes+"m "+remainSec+"s");
		return (getDurationString(minutes, remainSec));
	}
}
