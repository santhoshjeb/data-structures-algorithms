package StackUsingLinkedList;

import LinkedList.*;
public class Stack {

LinkedList list = new LinkedList();

	public void push(int element) {

		list.addToFront(element);
	}
	
	public void pop() {
		list.removeFromFront();
	}
	
	public void peek() {
		list.getFirst();
	}
	
	public void printElementsInTheStack() {
		list.printElementsInReverseOrder(list.firstNode);
	}
	
}
