package linkedListADT;

public class LinkedList {

	private Node head;
	private Node tail;

	// Agrega al inicio los elementos
	public void addFirst(int val) {
		if (isEmpty()) {
			head = new Node(val);
			tail = head;
			return;
		}
		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;
	}

	// Agrega al final los elementos
	public void addLast(int val) {
		if (isEmpty()) {
			head = new Node(val);
			tail = head;
			return;
		}
		Node newNode = new Node(val);
		tail.next = newNode;
		tail = newNode;
	}

	// Agrega un elemento en una posicion especifica
	public void add(int pos, int val) {
		if (pos == 1) {
			addFirst(val);
			return;
		}
		Node current = head;
		int count = 1;
		while (count < pos - 1) {
			count++;
			current = current.next;
		}
		Node newNode = new Node(val);
		newNode.next = current.next;
		current.next = newNode;
	}

	// Elimina el primer elemento
	public int deleteFirst() {
		if (isEmpty()) {
			throw new RuntimeException("La lista esta vacia");
		}
		Node current = head;
		head = head.next;
		current.next = null;
		if (isEmpty()) {
			tail = null;
		}
		return current.val;
	}

	// Elimina el ultimo elemento
	public int deleteLast() {
		if (isEmpty()) {
			throw new RuntimeException("La lista esta vacia");
		}
		if (head == tail) {
			int val = head.val;
			head = null;
			tail = null;
			return val;
		}
		Node current = head;
		Node prev = null;
		while (current.next != null) {
			prev = current;
			current = current.next;
		}
		prev.next = null;
		tail = prev;
		return current.val;
	}

	// Elimina el elemento en la posicion especificada
	public int delete(int pos) {
		if (isEmpty()) {
			throw new RuntimeException("La lista esta vacia");
		}
		if (pos == 1) {
			deleteFirst();
		}
		Node current = head;
		Node prev = null;
		int count = 1;
		while (count < pos) {
			count++;
			prev = current;
			current = current.next;
		}
		prev.next = current.next;
		current.next = null;
		return current.val;
	}

	// Indica si el elemento es existente o no
	public boolean search(int val) {
		Node current = head;
		while (current != null) {
			if (val == current.val) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	// Nos Indica si esta vacia la lista
	public boolean isEmpty() {
		return head == null;
	}

	// Nos Indica si esta vacia la lista
	public void print() {
		Node current = head;
		while (current != null) {
			System.out.print(current.val + "  -->  ");
			current = current.next;
		}
		System.out.println("null");
	}
}
