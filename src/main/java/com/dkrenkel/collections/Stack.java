/**
 * 
 */
package com.dkrenkel.collections;

/**
 * @author David Krenkel <david.melo1992@gmail.com>
 *
 */
public class Stack<T> {

	private Node<T> top;
	
	public boolean isEmpty() {
		return this.top == null;
	}
	
	public void push(T value) {
		this.top = new Node<T>(value, this.top);
	}
	
	public T peek() {
		return this.top.getValue();
	}
	
	public T pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is already empty");
		}
		T result = this.top.getValue();
		this.top = this.top.getNextNode();
		return result;
	}
}
