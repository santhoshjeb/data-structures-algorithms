package StackUsingArray;

public class ImplementationClass {
	
	public static void main(String ar[]) {
		
		int first_element = 100;
		int second_element = 200;
		Stack stack = new Stack();
		stack.push(first_element);
		stack.push(second_element);
		//stack.printElementsInTheStack();
		//System.out.println(stack.peek());
		stack.pop();
		stack.printElementsInTheStack();
		
	}

}
