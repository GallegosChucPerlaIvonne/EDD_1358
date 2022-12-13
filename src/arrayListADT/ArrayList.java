package arrayListADT;

public class ArrayList {
	private String[] array = new String[10];
	private int size = 0;

	// Agrega un elemento
	public void add(String s) {
		array[size] = s;
		size++;
		if (size == array.length) {
			String[] newArray = new String[array.length * 2];
			for (int i = 0; i < array.length; i++) {
				newArray[i] = array[i];
			}
			array = newArray;
		}
	}

	// Remueve un Elemento
	public void remove(int index) {
		if (index >= 0 && index < size) {
			for (int i = index; i < size - 1; i++) {
				array[i] = array[i + 1];
			}
			size--;
		}
	}

	// Obtiene el tamaño
	public int getSize() {
		return size;
	}

	// Limpia los datos
	public void clear() {
		ArrayList arreglo = null;
		arreglo.clear();
	}

	// Obtiene los elementos del arreglo
	public String get(int index) {
		return array[index];
	}

}
