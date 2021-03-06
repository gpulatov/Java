import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		// SimpleDateFormat is a concrete class for formatting and parsing date which inherits java.text.Dateformat class.
		// formatting means converting date to string and parsing means converting string to date.
		
		Date date = new Date();
		System.out.println(date);//Wed Nov 21 10:25:56 CST 2018
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); //M-month,m-minute
		String strDate = formatter.format(date);
		System.out.println(strDate);//21/11/2018
		
		formatter = new SimpleDateFormat("MM/dd/yyyy");
		strDate = formatter.format(date);
		System.out.println(strDate);//11/21/2018
		
		formatter = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		strDate = formatter.format(date);
		System.out.println(strDate); //11/21/2018 10:25:56
		
		formatter = new SimpleDateFormat("dd MMMM yyyy");
		strDate = formatter.format(date);
		System.out.println(strDate);//21 November 2018
		
		formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");
		strDate = formatter.format(date);
		System.out.println(strDate);//21 November 2018 Central Standard Time
		
		formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
		strDate = formatter.format(date);
		System.out.println(strDate);//Wed, 21 Nov 2018 10:31:49 CST

		
		
		//Convert String into Date
		formatter = new SimpleDateFormat("dd/MM/yyyy");
		date = formatter.parse("31/03/2015");
		
		System.out.println(date);
	}

}
