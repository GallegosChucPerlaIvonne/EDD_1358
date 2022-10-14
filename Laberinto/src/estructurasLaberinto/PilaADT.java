package estructurasLaberinto;

import java.util.ArrayList;

public class PilaADT<T> {
	ArrayList<T> pila;

	public PilaADT() {
		this.pila = new ArrayList<>();
	}

	public boolean isEmpty() {
		return this.pila.isEmpty();
	}

	public int getLength() {
		return this.pila.size();
	}

	public T pop() {
		if (!this.pila.isEmpty()) {
			T dato = this.pila.get(this.pila.size() - 1);
			this.pila.remove(this.pila.size() - 1);
			return dato;
		}
		return null;
	}

	public T peek() {
		if (!this.pila.isEmpty()) {
			T dato = this.pila.get(this.pila.size() - 1);
			return dato;
		}
		return null;
	}

	public void push(T valor) {
		this.pila.add(valor);
	}

	@Override
	public String toString() {
		String pila = "";
		if (this.pila.isEmpty()) {
			pila += "| | \n";
		} else {
			@SuppressWarnings("unchecked")
			ArrayList<T> copiaPila = (ArrayList<T>) this.pila.clone();
			String[] matriz = new String[copiaPila.size()];
			int contadorUno = matriz.length, contadorDos = 0;
			for (int i = contadorUno; i > 0; i--) {
				matriz[contadorDos] = String.valueOf(copiaPila.get(copiaPila.size() - 1));
				copiaPila.remove(copiaPila.size() - 1);
				contadorDos++;
			}
			for (String s : matriz) {
				pila += "|" + s + "| \n";
			}
		}
		return pila;
	}
}
