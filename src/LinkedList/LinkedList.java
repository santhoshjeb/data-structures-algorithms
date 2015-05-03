package LinkedList;

public class LinkedList {
	
	public Node linkedList;
	public Node firstNode;
	public Node lastNode;

	public void addToFront(int element) {
		if(linkedList == null) {
			linkedList = new Node(element,null);
		}
		else {
			//create a new node
			Node newNode = new Node(element,null);
			newNode.next = firstNode;
			firstNode = newNode;
		}	
	}

	public void addToLast(int element) {
			
		if(linkedList == null){
			linkedList = new Node(element,null);
			firstNode = linkedList;
		}
		else{
			while(linkedList.next!=null) {	
				linkedList = linkedList.next;
			}
			linkedList.next = new Node(element,null);
			lastNode = linkedList.next;
		}
	}
	
	public void removeFromFront() {
		
		if(linkedList!=null) {
			firstNode = firstNode.next;
			// the original first node will be garbage collected
		}
		
	}
	
	public void removeFromLast() {
		
		linkedList = firstNode;
		Node previousElement = null;
		
		while(linkedList.next!=null) {
			previousElement = linkedList;
			linkedList = linkedList.next;
		}
		previousElement.next=null;
		lastNode = previousElement;
	}
	
	public void printElementsOfLinkedList() {
		
		linkedList = firstNode;
		
		while(linkedList.next!=null)
		{
			System.out.print(" "+linkedList.element);
			linkedList = linkedList.next;
		}
		System.out.print(" "+linkedList.element);
	}
	
	public void printElementsInReverseOrder(Node list) {
		//Option1: loop through elements from the front and add it to another collection and print that collection

		if(list.next == null) {
			System.out.print(" "+list.element); //prints the last element
		}
		else {
			printElementsInReverseOrder(list.next);
			System.out.print(" "+list.element);
		}
	}
	
	public void getFirst() {
		System.out.println(firstNode.element);
	}
	
	public void getLast() {
		System.out.println(lastNode.element);
		
	}
}
