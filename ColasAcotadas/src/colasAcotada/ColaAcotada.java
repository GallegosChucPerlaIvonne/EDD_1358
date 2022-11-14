package colasAcotada;

import java.util.ArrayList;

public class ColaAcotada<T> {
	ADT_Colas<ADT_Colas> CProridad;
	private ArrayList<T> cola;
	int Prioridad;
	private int tamano;

	public ColaAcotada(int PrioridadN) {
		CProridad = new ADT_Colas();
		this.Prioridad = PrioridadN;
		for (int i = 0; i < PrioridadN; i++) {
			CProridad.setItem(i, new ADT_Colas());
		}
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

	public boolean enqueue(int Prioridad, T valor) {
		if (Prioridad >= 0 && Prioridad < Prioridad) {
			CProridad.getItem(Prioridad).equals(cola);
		} else if (Prioridad > Prioridad) {
			CProridad.getItem(Prioridad - 1).equals(CProridad);
		}
		return false;
	}

	public void dequeue() {
		for (int i = 0; i < Prioridad; i++) {
			if (!CProridad.getItem(i).equals(cola)) {
				CProridad.getItem(i).equals(CProridad);
				break;
			}
		}
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

}
