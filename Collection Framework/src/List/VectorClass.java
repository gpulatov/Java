package List;

import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		
		//Vector has an initial size of 10; and increase capacity is 100%
		//Vector is slow -- not good to use
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(1);
		v1.add(1);
		v1.add(1);
		v1.add(1);
		v1.add(1);
		v1.add(1);
		v1.add(1);
		v1.add(1);
		v1.add(1);
		v1.add(10);
		
		v1.add(11);
		System.out.println(v1.capacity());
	}

}
