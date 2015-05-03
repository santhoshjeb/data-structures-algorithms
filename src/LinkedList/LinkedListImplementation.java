package LinkedList;

public class LinkedListImplementation {
	
	public static void main(String args[]) {
		
		LinkedList linkedlist = new LinkedList();
		
		linkedlist.addToLast(1);
		linkedlist.addToLast(2);
		linkedlist.addToLast(3);
		linkedlist.addToLast(4);
		linkedlist.addToLast(5);
		linkedlist.addToLast(6);
		linkedlist.addToFront(0);
		linkedlist.addToFront(-1);
		linkedlist.removeFromFront();
		// -1 should be removed and the result should be [0,1,2,3,4,5,6]
		linkedlist.removeFromLast();
		// -1 should be removed and the result should be [0,1,2,3,4,5]
		//linkedlist.printElementsOfLinkedList();
		linkedlist.getFirst(); //returns 0
		linkedlist.getLast();  // returns 5
		
	}

}
