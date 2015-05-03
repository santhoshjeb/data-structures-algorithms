/*
 * Implementing a stack(LIFO)
 *  using an array
 * 
 * Functions supported: push, pop, peek
 * 
 * Author: Santhosh Jebamani
 * version: Original Implementation
 * */

package StackUsingArray;

public class Stack {
	
	int elements[] = new int[10];
	int numberOfElements = 0;
	
	public void push(int newElement) {
		elements[numberOfElements] = newElement;
		numberOfElements++;
	}
	
	public void pop() {
		elements[numberOfElements] = -1;
		numberOfElements--;
	}
	
	public int peek() {
		return elements[numberOfElements-1];
	}
	
	public void printElementsInTheStack() {
		// Printing in the same order added
		for(int j=numberOfElements; j>0; j--)
		{
			System.out.println(" "+elements[j-1]);
		}
	}
}


/*
* Notes: A stack just stacks up items. When an element is requested, it
* pulls out the last element added.
*
* Original approach: When a push request is raised, i added the element to
* the array and increased the counter to keep track of the number of elements.
* When a pop request is done, i just nullified the last element in the array (which is also the
* element to be popped) and decreased the count. Here, pop works the same as remove. However, peek
* returns the last element(or the top most element of the stack)
*
*
* Alternate/Ideal approach:
* Use a pointer and use the pointer to keep track of the last element of the array
* */
