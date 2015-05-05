package QueueUsingArray;
/*
 * Implementing a queue(FIFO) 
 * using an array
 * 
 * Functions supported: Add, Remove, Peek
 * 
 * Author: Santhosh Jebamani
 * */

public class Queue {
	
	public int elements[] = new int[10];
	public int rear=-1;
	int front = 0;

	public void enqueue(int x) {

		rear++;
		if(rear>=elements.length)
		{
			throw new IllegalStateException("Maximum size reached");
		}
		elements[rear] = x;
	}

	/*Method to look up first element in the queue*/
	public int peek() {
		
		//if the array is not empty
		if(rear>=front)
		return elements[front];
		else
			throw new IllegalStateException("Can't peek ! Queue is empty");
	}
	
	public int dequeue() {
		int removedValue = -1;
		if(rear>=front) {

			removedValue = elements[front];
			front++;
		}
		else
		{
			throw new IllegalStateException("Queue is empty");
		}
		return removedValue;
    }
	
	public void printElementsInTheQueue(){
		for(int j=front; j<=rear; j++)
		{
			System.out.print(" "+elements[j]);
		}
	}
}
