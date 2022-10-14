package estructurasLaberinto;

import java.util.ArrayList;

public class Arreglo2DADT<T> {

	private ArrayList<ArrayList<T>> arreglo2D;
	private int renglones;
	private int columnas;

	// Array2D( ren , col): Constructor
	public Arreglo2DADT(int renglones, int columnas) {
		this.renglones = renglones;
		this.columnas = columnas;
		arreglo2D = new ArrayList<>();
		for (int i = 0; i < this.renglones; i++) {
			arreglo2D.add(new ArrayList<>());
			for (int j = 0; j < this.columnas; j++) {
				arreglo2D.get(i).add(null);
			}
		}
	}

	// clear( dato ): Establecer todos los valores del arreglos al valor “dato”
	public void limpiar(T dato) {
		for (int i = 0; i < renglones; i++) {
			for (int j = 0; j < columnas; j++) {
				arreglo2D.get(i).set(j, dato);
			}
		}
	}

	// get_row_size(): Regresa el tamaño de renglones.
	public int getRenglones() {
		return this.renglones;
	}

	// get_col_size(): Regresa el tamaño de columnas.
	public int getColumnas() {
		return this.columnas;
	}

	// set_item( ren , col , dato): Establece “dato” en la posición ren , col.
	public void setElemento(int renglon, int columna, T dato) {
		arreglo2D.get(renglon).set(columna, dato);

	}

	// get_item( ren , col ): Regresa el valor en la posición ren , col.
	public T getElemento(int renglon, int columnas) {
		return arreglo2D.get(renglon).get(columnas);
	}

	// to_string(): Regresa un objeto string que representa el estado actual del objeto.
	public String toString() {
		String array2d = "";
		for (int i = 0; i < this.renglones; i++) {
			for (int j = 0; j < this.columnas; j++) {
				array2d += this.getElemento(i, j) + " [" + i + "," + j + "]   ";
			}
			array2d += "\n";
		}
		return array2d;
	}
}
