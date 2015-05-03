package QueueUsingStack;
import StackUsingArray.*;

public class Queue {
	
	Stack stack = new Stack();
	int numberOfElements = 0;
	
	public void add(int element) {
		stack.push(element);
		numberOfElements++;
	}
	
	public void remove() {
		
	}
	
	public void peek() {
		
		//pop from one stack and move it to another stack
		// pop from the new stack
		
	}
	
	public void printElementsInTheQueue() {
		
	}

}
