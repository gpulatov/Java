
public class Main {

	public static void main(String[] args) {
		
//		Dog d1 = new Dog();
//		Cat c1 = new Cat();
//		Bird b1 = new Bird();
//		
//		d1.speak();
//		c1.speak();
//		b1.speak();

		
		//we can create our objects reference to our parent
//		Animal a1 = new Dog();
//		a1.speak();
//		
//		Animal a2 = new Cat();
//		a2.speak();
//		
//		Animal a3 = new Bird();
//		a3.speak();
		
		//Polymorphism is acting from this point
		Animal a = new Animal();
		
		a = new Dog();
		a.speak();
		
		
		a = new Cat();
		a.speak();
		
		a = new Bird();
		a.speak();
		
	}

}