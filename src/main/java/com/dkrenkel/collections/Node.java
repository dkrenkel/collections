/**
 * 
 */
package com.dkrenkel.collections;

/**
 * @author David Krenkel <david.melo1992@gmail.com>
 *
 */
public class Node<T> {

	private T value;
	private Node<T> nextNode;
	
	public Node() {
	}
	
	public Node(T value, Node<T> nextNode) {
		this.value = value;
		this.nextNode = nextNode;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
	
}
