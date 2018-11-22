
public class Main {

	public static void main(String[] args) {
		
		//DeskPhone phone1 = new DeskPhone(20220202, true);
		
		ITelephone phone = new DeskPhone(20220202, true);
		phone.powerOn();
		phone.callPhone(20220202);
		phone.answer();
		phone.dial(20220202);

	}

}
