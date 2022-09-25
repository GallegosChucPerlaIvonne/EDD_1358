package listadoble;

public class ListaDoblementeLigada<T> {
	
	NodoDoble<T> head;
	int tamanio;

	public ListaDoblementeLigada() {
		this.head = null;
		this.tamanio = 0;
	}

	public boolean esta_vacia() {
		return this.head == null;
	}

	public int get_tamanio() {
		NodoDoble<T> nuevo = this.head;
        int tamanio=0;
        while (nuevo.getSiguiente() != null) {
                nuevo = nuevo.getSiguiente();
                
                tamanio=tamanio+1;
                
            }
        return tamanio=tamanio+1;
	}

	public void agregar_al_inicio(T valor) {
		NodoDoble<T> nuevo = new NodoDoble<T>(valor);
		if (this.esta_vacia()) {
			this.head = nuevo;
			this.tamanio++;
		} else {
			nuevo.setSiguiente(this.head);
			this.head.setAnterior(nuevo);
			this.head = nuevo;
			this.tamanio++;
		}
	}

	public void agregar_al_final(T valor) {
		NodoDoble<T> nuevo = new NodoDoble<T>(valor);
		if (this.head == null) {
			this.head = nuevo;
			this.tamanio++;
		} else {
			NodoDoble<T> aux = this.head;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);
			nuevo.setAnterior(aux);
			this.tamanio++;
		}
	}

	public void agregar_despues_de(T valor, int posicion) {
		NodoDoble<T> nuevo = new NodoDoble<T>(valor);
		NodoDoble<T> aux = this.head;
		if (posicion > 1) {
			for (int contador = 1; contador <= posicion - 1; contador++) {
				aux = aux.getSiguiente();
			}
		}
		nuevo.setSiguiente(aux.getSiguiente());
		aux.setSiguiente(nuevo);
		aux.getSiguiente().setAnterior(nuevo);
		nuevo.setAnterior(aux);
		this.tamanio++;
	}

	public void Eliminar_el_primero() {
		if (this.head != null) {
			NodoDoble<T> aux = this.head;
			aux.getSiguiente().setAnterior(null);
			aux = aux.getSiguiente();
			this.head = aux;
			this.tamanio--;
		}
	}

	public void Eliminar_al_final() {
		if (this.get_tamanio() == 1) {
			this.head = null;
			this.tamanio--;
		} else {
			if (this.get_tamanio() > 1) {
				NodoDoble<T> aux = this.head;
				NodoDoble<T> aux2 = new NodoDoble<T>();
				while (aux.getSiguiente() != null) {
					aux2 = aux;
					aux = aux.getSiguiente();
				}
				aux2.setSiguiente(null);
				aux.setAnterior(null);
				this.tamanio--;
			}
		}
	}

	public void Eliminar(int posicion) {
		NodoDoble<T> aux = this.head;
		NodoDoble<T> aux2 = aux;
		boolean bandera = true;
		int contador = 1;
		if (posicion == 1) {
			if (aux.getSiguiente() == null) {
				this.head = null;
				this.tamanio--;
			} else {
				aux.getSiguiente().setAnterior(null);
				this.head = aux.getSiguiente();
				this.tamanio--;
			}
		} else {
			if (posicion > 1) {
				while (bandera) {
					if (contador == posicion) {
						if (aux.getSiguiente() == null) {
							aux2.setSiguiente(null);
							this.tamanio--;
							break;
						} else {
							aux2.setSiguiente(aux.getSiguiente());
							aux.getSiguiente().setAnterior(null);
							this.tamanio--;
							break;
						}
					}
					contador++;
					aux2 = aux;
					aux = aux.getSiguiente();
				}
			}
		}
	}

	public int buscar(T dato) {
		NodoDoble<T> aux = this.head;
		int contador = 1;
		for (int i = 1; i <= this.tamanio; i++) {
			if (aux.getValor() == dato) {
				return contador;
			}
			contador++;
			aux = aux.getSiguiente();
		}
		return 0;
	}

	public void actualizar(T valorABuscar, T valorParaActualizar) {
		NodoDoble<T> aux = this.head;
		for (int i = 1; i <= this.tamanio; i++) {
			if (aux.getValor() == valorABuscar) {
				aux.setValor(valorParaActualizar);
				break;
			}
			aux = aux.getSiguiente();
		}
	}

	public void transversal() {
		NodoDoble<T> curr_node = this.head;
		System.out.print(null + " ");
		while (curr_node != null) {
			System.out.print(curr_node);
			curr_node = curr_node.getSiguiente();
		}
		System.out.println("");
	}
}
