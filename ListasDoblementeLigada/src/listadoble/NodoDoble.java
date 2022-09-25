package listadoble;

public class NodoDoble<T> {
	private T valor;
	private NodoDoble<T> anterior;
	private NodoDoble<T> siguiente;

	public NodoDoble() {
	}

	public NodoDoble(T valor) {
		this.valor = valor;
	}

	public NodoDoble(T dato, NodoDoble<T> anterior, NodoDoble<T> siguiente) {
		this.valor = dato;
		this.anterior = anterior;
		this.siguiente = siguiente;
	}

	public NodoDoble<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoDoble<T> anterior) {
		this.anterior = anterior;
	}

	public NodoDoble<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoDoble<T> siguiente) {
		this.siguiente = siguiente;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return " | " + valor + " | ";
	}
}
