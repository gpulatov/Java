
public class staticMainClass {

	public static void main(String[] args) {

		StaticTest static1 = new StaticTest("instance-1");
		System.out.println(static1.getName() + " is instance number " + static1.getNumInstance());

		StaticTest static2 = new StaticTest("instance-2");
		System.out.println(static2.getName() + " is instance number " + static2.getNumInstance());
		int newInstanceNum = static2.getNumInstance();
		newInstanceNum--;
		System.out.println(newInstanceNum);
		
		StaticTest static3 = new StaticTest("instance-3");
		System.out.println(static3.getName() + " is instance number " + static3.getNumInstance());

	}

}
