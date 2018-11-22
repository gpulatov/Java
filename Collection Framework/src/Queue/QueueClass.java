package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {

	public static void main(String[] args) {
		
		Queue<Integer> q1 = new PriorityQueue<Integer>();
		
		//Add elements
		for(int i=0; i<5; i++) {
			q1.add(i);
		}

		System.out.println(q1);
		
		int removedElem= q1.remove();
		System.out.println(removedElem);
		
		System.out.println(q1);
	}

}
