package laberinto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import estructurasLaberinto.*;

public class Laberinto {

	public static void main(String[] args) {
		Laberinto laberinto = new Laberinto(
				"D:\\FES_Materias\\1_EDatos\\Espacio_de_trabajo\\Laberinto\\src\\laberinto\\LaberintoComas.txt");

		System.out.println("\n---------Laberinto---------\n");
		laberinto.imprimirLaberinto();
		laberinto.moverLaberinto();
		System.out.println("\nCamino: \n");
		laberinto.solucion();
	}

	private Arreglo2DADT laberinto;
	private PilaADT circuitoCorrecto = new PilaADT();
	private Borde borde;
	private int[] coordenadaEntrada = new int[2];
	private int[] coordenadaSalida = new int[3];

	public Laberinto(String Archivo) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(Archivo));
			int fila;
			int columna;
			fila = Integer.parseInt(br.readLine());
			columna = Integer.parseInt(br.readLine());
			borde = new Borde(columna, fila);
			laberinto = new Arreglo2DADT(fila, columna);
			for (int enumerarFila = 0; enumerarFila < fila; enumerarFila++) {
				String lineaActual = br.readLine();
				String[] comas = lineaActual.split(",");
				for (int enumerarColumna = 0; enumerarColumna < fila; enumerarColumna++) {
					String caracterActual = comas[enumerarColumna];
					if (caracterActual.equals("0")) {
						laberinto.setElemento(enumerarFila, enumerarColumna, false);
					} else if (caracterActual.equals("1")) {
						laberinto.setElemento(enumerarFila, enumerarColumna, true);
					} else if (caracterActual.equals("E")) {
						laberinto.setElemento(enumerarFila, enumerarColumna, true);
						coordenadaEntrada[0] = enumerarFila;
						coordenadaEntrada[1] = enumerarColumna;
					} else if (caracterActual.equals("S")) {
						laberinto.setElemento(enumerarFila, enumerarColumna, true);
						coordenadaSalida[0] = enumerarFila;
						coordenadaSalida[1] = enumerarColumna;
					}
				}
			}
		} catch (FileNotFoundException ex) {
			System.out.println("No se halló el archivo");
		} catch (IOException ex) {
			Logger.getLogger(Laberinto.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void imprimirLaberinto() {
		for (int enumerarFila = 0; enumerarFila < laberinto.getRenglones(); enumerarFila++) {
			for (int enumerarColumna = 0; enumerarColumna < laberinto.getColumnas(); enumerarColumna++) {
				int[] ubicacion = { enumerarFila, enumerarColumna };

				if ((boolean) laberinto.getElemento(enumerarFila, enumerarColumna)) {
					if (compararCoordenadas(coordenadaEntrada, ubicacion)) {
						System.out.print(" E ");
					} else if (compararCoordenadas(coordenadaSalida, ubicacion)) {
						System.out.print(" S ");
					} else {
						System.out.print(" ○ ");
					}
				} else {
					System.out.print(" | ");
				}
			}
			System.out.println("");
		}
	}

	public void moverLaberinto() {
		int[] pasoActual = coordenadaEntrada;
		int[] pasoAnterior = pasoActual;
		int[] problema = { -1, -1 };
		boolean punto = true;
		circuitoCorrecto.push(pasoActual);
		do {
			int[] nuevaPosicion = siguientePaso(pasoActual, pasoAnterior);
			pasoAnterior = pasoActual;
			pasoActual = nuevaPosicion;
			if (compararCoordenadas(pasoActual, coordenadaSalida)) {
				circuitoCorrecto.push(pasoActual);
				punto = false;
			} else if (compararCoordenadas(pasoActual, problema)) {
				int[] eliminar = (int[]) circuitoCorrecto.pop();
				laberinto.setElemento(eliminar[0], eliminar[1], false);
				pasoActual = (int[]) circuitoCorrecto.pop();
				pasoAnterior = (int[]) circuitoCorrecto.peek();
				circuitoCorrecto.push(pasoActual);
				if (compararCoordenadas(eliminar, coordenadaEntrada)) {
					punto = false;
					circuitoCorrecto = null;
				}
			} else {
				circuitoCorrecto.push(pasoActual);
			}
		} while (punto);
	}

	private int[] siguientePaso(int[] coordenadaActual, int[] coordenadaAnterior) {
		int columnaX = coordenadaActual[1];
		int filaY = coordenadaActual[0];
		int[] coordenadaNueva = null;
		boolean[] sujeto = new boolean[4];
		boolean posicion = false;
		sujeto = saltar(filaY, columnaX);
		for (int paso = 0; paso <= 4; paso++) {
			if (paso < 4) {
				if (sujeto[paso]) {
					coordenadaNueva = reglas(paso, filaY, columnaX);
					posicion = (boolean) laberinto.getElemento(coordenadaNueva[0], coordenadaNueva[1]);
					if (posicion && !compararCoordenadas(coordenadaNueva, coordenadaAnterior)) {
						break;
					}
				} else {
					continue;
				}
			} else {
				coordenadaNueva[0] = -1;
				coordenadaNueva[1] = -1;
			}
		}
		return coordenadaNueva;
	}

	private boolean[] saltar(int fila, int columna) {
		boolean[] sujeto = { true, true, true, true };
		if (fila == 0) {
			sujeto[1] = false;
		} else if (fila == laberinto.getRenglones() - 1) {
			sujeto[3] = false;
		}
		if (columna == 0) {
			sujeto[0] = false;
		} else if (columna == laberinto.getColumnas() - 1) {
			sujeto[2] = false;
		}
		return sujeto;
	}

	public int[] reglas(int paso, int ren, int col) {
		int[] coordenadaNueva = new int[2];
		if (paso == 0) {
			coordenadaNueva[0] = ren;
			coordenadaNueva[1] = col - 1;
		} else if (paso == 1) {
			coordenadaNueva[0] = ren - 1;
			coordenadaNueva[1] = col;
		} else if (paso == 2) {
			coordenadaNueva[0] = ren;
			coordenadaNueva[1] = col + 1;
		} else if (paso == 3) {
			coordenadaNueva[0] = ren + 1;
			coordenadaNueva[1] = col;
		}
		return coordenadaNueva;
	}

	private boolean compararCoordenadas(int[] coordenadaNueva, int[] coordenadaAnterior) {
		return (coordenadaNueva[0] == coordenadaAnterior[0]) && (coordenadaNueva[1] == coordenadaAnterior[1]);
	}

	public void solucion() {
		if (circuitoCorrecto == null) {
			System.out.println("Sin camino de salida");
		} else {
			PilaADT pilaRecargable = new PilaADT();
			while (circuitoCorrecto.getLength() != 0) {
				int[] coordenada = (int[]) circuitoCorrecto.pop();
				pilaRecargable.push(coordenada);
				System.out.println("_____");
				System.out.printf(" %d,%d \n", coordenada[0], coordenada[1]);
				System.out.println("_____");
			}
		}
	}
}