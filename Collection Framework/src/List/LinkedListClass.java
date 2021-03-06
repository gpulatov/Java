package List;

import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		
		LinkedList<String> obj = new LinkedList<String>();
		obj.add("A");
		obj.add("B");
		obj.addLast("C");
		obj.addFirst("D");
		obj.add(2, "A");
		obj.add("F");
		obj.add("G");
		System.out.println(obj);
		obj.remove(2);
		obj.remove("B");
		obj.removeLast();
		System.out.println(obj);
		
		int sizeOfList = obj.size();
		System.out.println(sizeOfList);
		System.out.println(obj.get(2));//C
		System.out.println(obj.get(sizeOfList-1));//F
	}

}
