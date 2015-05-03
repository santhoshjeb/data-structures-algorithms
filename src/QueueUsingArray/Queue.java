package QueueUsingArray;
/*
 * Implementing a queue(FIFO) 
 * using an array
 * 
 * Functions supported: Add, Remove, Peek
 * 
 * Author: Santhosh Jebamani
 * */

public class Queue implements Cloneable{
	
	public int elements[] = new int[10];
	public int numberOfElementsAdded=0;
	
	
	public void add(int x) {
		
		elements[numberOfElementsAdded] = x;
		numberOfElementsAdded++;
	}
	
	
	/*Method to look up first element in the queue*/
	public int peek() {
		
		//if the array is not empty
		if(numberOfElementsAdded!=0)
		return elements[0];
		else
			return -1;
	}
	
	public int remove() {
		
		
		int removedValue = -1;
		// Invalidate the first element in the array
		if(numberOfElementsAdded!=0){
			
			 removedValue = elements[0];
		
			for(int i=0; i< numberOfElementsAdded; i++)
		      {
			elements[i] = elements[i+1];
		      }
	
		//y[numberOfElementsAdded-1]=-1;
		numberOfElementsAdded--;
	}
		return removedValue;
		
}
	
	public void printElementsInTheQueue(){
		for(int j=0; j<numberOfElementsAdded; j++)
		{
			System.out.print(" "+elements[j]);
		}
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

//TODO: Add support to accept negative numbers
//TODO: Refactor code and make it better
//TODO: Support to add any type of variable
