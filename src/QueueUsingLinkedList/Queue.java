package QueueUsingLinkedList;

import LinkedList.*;

public class Queue {

	LinkedList list = new LinkedList();
	
	public void add(int element) {
		list.addToLast(element);	
	}
	
	public void remove() {
		
		list.removeFromFront();
		
	}
	
	public void peek() {
		
		list.getFirst();
		
	}
	
	public void printElementsInTheQueue() {
		
		// It should be in the reverse order here
		
		list.printElementsInReverseOrder(list.firstNode);
		
	}
}
