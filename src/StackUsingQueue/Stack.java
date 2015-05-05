////Question: Does the queue and the stack need an iterate function ?
//
//package StackUsingQueue;
//import java.util.Arrays;
//
//import QueueUsingArray.*;
//
//public class Stack implements Cloneable {
//
//	Queue queue = new Queue();
//	int numberOfElements = 0;
//
//	public void push(int newElement) {
//		queue.enqueue(newElement);
//		numberOfElements++;
//	}
//	public void peek() {
//
//		// Creating a new queue without sharing instance
//		Queue tempQueue = new Queue();
//
//		tempQueue.numberOfElementsAdded = queue.numberOfElementsAdded;
//		tempQueue.elements = queue.elements;
//		tempQueue.elements = Arrays.copyOf(queue.elements, queue.elements.length);
//
//			//tempQueue = (Queue)queue.clone();
//
//
//
//		int lastElement = -1;
//		while(tempQueue.numberOfElementsAdded >= 1){
//			lastElement = tempQueue.remove();
//		}
//
//		System.out.println(lastElement);
//	}
//
//	public int pop() {
//
//
//		int lastElement = 0;
//		Queue tempQueue = new Queue();
//		while(queue.numberOfElementsAdded > 1){
//			tempQueue.add(queue.remove());
//			lastElement = queue.peek();
//		}
//
//		queue = tempQueue;
//		return lastElement;
//
//	}
//
//	public void printElementsInTheStack() {
//		Queue tempQueue = new Queue();
//		try {
//			tempQueue = (Queue)queue.clone();
//		} catch (CloneNotSupportedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		while(tempQueue.numberOfElementsAdded >= 1){
//			System.out.println(tempQueue.remove());
//		}
//	}
//
//	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
//
//	}
//
//}
