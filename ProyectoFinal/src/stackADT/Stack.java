package stackADT;

public class Stack {
	private int[] stack;
	private int top = -1;
	private int capacity;

	// La pila maneja n numero de elementos
	public Stack(int n) {
		this.capacity = n;
		stack = new int[capacity];
	}

	// Desarrollamos el metodo push para agregar un elemento al tope de la
	// estructura.
	public void push(int data) {
		if (isFull()) {
			throw new RuntimeException("La Pila esta llena");
		}
		// Como el �ndice superior siempre apunta al �ltimo elemento de la pila,
		// incrementamos
		// el �ndice superior en 1 para empujar los datos
		top = top + 1;
		stack[top] = data;
	}

	// Desarrollamos el metodo pop para sacar el elemento del tope y que lo regrese.
	// El puntero al tope se mueve al anterior elemento.
	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("La Pila esta Vac�a");
		}
		// La operaci�n pop elimina el elemento �ltimo de la pila
		// disminuye el �ndice superior en 1
		int data = stack[top];
		top = top - 1;
		return data;
	}

	// Desarrollamos el metodo peek para consultar el elemento en el tope, sin
	// sacarlo.
	public int peek() {
		if (isEmpty()) {
			throw new RuntimeException("La Pila esta Vac�a");
		}
		return stack[top];
	}

	// Esta operaci�n es opcional en el caso de que se quiera poner un l�mite al
	// n�mero de elementos.
	public boolean isFull() {
		return stack.length == top + 1;
	}

	// nos indica si esta vac�o o no
	public boolean isEmpty() {
		return top == -1;
	}

	// Nos ayuda a imprimir mediante el metodo LIFO
	public void print() {
		System.out.print("Elementos de la Pila--> ");
		for (int i = 0; i < top + 1; i++) {
			System.out.print(stack[i] + " ");
		}
		System.out.println();
	}
}
