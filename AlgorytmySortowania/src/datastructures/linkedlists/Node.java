package datastructures.lists;

public class Node<T> {

	private T value;
	private Node<T> next;

	public Node(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public boolean hasNext() {
		// this.next != null ? true : false;

		if (this.next != null) {
			return true;
		} else {
			return false;
		}

	}

}