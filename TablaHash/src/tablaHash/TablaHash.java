package tablaHash;

public class TablaHash<T> {
	private ArrayList<ArrayList<T>> superior;
	private int tamano;

	public HashTableADT(int tamano) {
        if (tamano%2!=0){
            this.tamano = tamano;
        }
    }

	public T valueOf(int key) {
		String llave = "" + key;
		int escaque = key % tamano;
		T resultado = (T) "elemento no exis<tente";
		for (int i = 0; i <= superior.get(escaque).size() - 1; i++) {
			String comp = (String) superior.get(escaque).get(i);
			if (comp.equals(llave)) {
				resultado = this.superior.get(escaque).get(i + 1);
				break;
			}
		}
		return resultado;
	}
	
	public void Add(int key, T value) {
		T llave = (T) ("" + key);
		int escaque = key, tamano;
		this.superior.get(escaque).add(llave);
		this.superior.get(escaque).add(value);
	}
	
	public void Remove(int key) {
		String llave = "" + key;
		int escaque = key, tamano;
		for (int i = 0; i <= superior.get(escaque).size() - 1; i++) {
			String comp = (String) superior.get(escaque).get(i);
			if (comp.equals(llave)) {
				superior.get(escaque).remove(i + 1);
			}
		}
	}
}
