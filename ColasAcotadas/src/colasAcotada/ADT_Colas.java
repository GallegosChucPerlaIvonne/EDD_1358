package colasAcotada;

import java.util.ArrayList;

public class ADT_Colas<T> {
	private ArrayList<T> cola;
	private int tamano;

	public void colas() {
		this.tamano = 0;
		this.cola = new ArrayList();
	}

	public boolean is_empty() {
		if (this.cola.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int length() {
		{
			this.tamano = cola.size();
			return tamano;
		}
	}

	public void enqueue(T valor) {
		this.cola.add(valor);
	}

	public T dequeue() {
		T elemento = this.cola.get(0);
		this.cola.remove(0);
		return elemento;
	}

	public String to_string() {
		String pl = "";
		for (T t : this.cola) {
			if (t != null) {
				pl += "|" + "-";
			} else {
				break;
			}
		}
		return pl;
	}

	public Object getItem(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setItem(int i, ADT_Colas adt_Colas) {
		// TODO Auto-generated method stub
		
	}
}
