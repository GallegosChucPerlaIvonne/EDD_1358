/*
Alumna: Gallegos Chuc Perla Ivonne
Tarea 3: Empresa
*/
package tareaEmpresa;

import java.util.ArrayList;

public class ArregloEmpresa <T> {

	public static void main(String[] args) {
		
		ArregloEmpresa<String> febrero = new ArregloEmpresa<String>(5);
        for (int i = 0; i < febrero.getLenght(); i++) {
            febrero.setItem(i, "Prueba " + i);
        }

        for (int i = 0; i < febrero.getLenght(); i++) {
            System.out.println("El elemento se encuentra en el índice "
                    + i + " es: " + febrero.getItem(i));
        }

        febrero.clear("2Prueba");
        for (int i = 0; i < febrero.getLenght(); i++) {
            System.out.println("El elemento se encuentra en el índice "
                    + i + " es: " + febrero.getItem(i));
        }
    }

    int tam;
    private final ArrayList<T> datos;

    public ArregloEmpresa(int tam) {
        this.tam = tam;
        this.datos = new ArrayList<>(tam);
        for (int j = 0; j < tam; j++) {
            datos.add(null);
        }
    }

    public T getItem(int Indice) {
        if (Indice >= 0 && Indice < this.tam) {
            return datos.get(Indice);
        }
        return null;
    }

    public void setItem(int Indice, T Elemento) {
        if (Indice >= 0 && Indice < this.tam) {
            datos.set(Indice, Elemento);
        } else {
            System.out.println("No existe tal indice en este arreglo.");
        }
    }

    public int getLenght() {
        return datos.size();
    }

    public void clear(T Elemento) {
        for (int i = 0; i < datos.size(); i++) {
            datos.set(i, Elemento);
        }
    }
}
