
public class Main {

	public static void main(String[] args) {
		
		Assign21VipCustomer v1 = new Assign21VipCustomer();
		System.out.println(v1.getName());
		

		Assign21VipCustomer v2 = new Assign21VipCustomer("James", 4500.0);
		System.out.println(v2.getName()+" has credit limit "+v2.getCreditLimit());
	}

}
