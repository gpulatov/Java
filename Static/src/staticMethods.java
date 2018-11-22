
public class staticMethods {

	public static void main(String[] args) {
		Abc.show1();
		
		Abc x = new Abc();
		x.show2();

	}

}


class Abc {
	 public static void show1() {
		 System.out.println("Hi");
		 //show2();// we cannot call instance method inside static method
		 show4();
	 }
	 
	 public void show2() {
		 System.out.println("Hi");
		 show1();
		 show3();
	 }
	 
	 public void show3() {
		 System.out.println("Hi");
	 }
	 
	 public static void show4() {
		 System.out.println("Hi");
	 }
}
