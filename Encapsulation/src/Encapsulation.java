
public class Encapsulation {

	public static void main(String[] args) {
		Car porsche = new Car();
		porsche.setModel("911");
		String model55 = porsche.getModel();
		System.out.println(model55);
		
		System.out.println("=====================\n\n");
		
		TaskBankAccount mikeAccount = new TaskBankAccount();
		mikeAccount.setAccountNumber(932556020);
		mikeAccount.setBalance(2.5);
		mikeAccount.setName("Mike");
		
		mikeAccount.withdraw(100.0);
		mikeAccount.deposit(150.0);
		mikeAccount.withdraw(50.0);
		
		System.out.println(mikeAccount.getName());
		
	}

}
