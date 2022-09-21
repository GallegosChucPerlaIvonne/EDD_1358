package juegoDeLaVida;

import ADT2D.Array2D;
import java.util.Scanner;

public class Juego {

	private Tablero tablero;
	private Array2D<String> modelo;

	public Juego() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int ren, col, numCel = 1;
		String salida = "s";
		System.out.println("\n------------------------> Juego de la Vida <-----------------------");
		System.out.println("\nPor favor ingrese el número de renglones que tendrá el tablero --->");
		ren = Integer.parseInt(s.nextLine());
		System.out.println("Por favor ingrese el número de columnas que tendrá el tablero --->");
		col = Integer.parseInt(s.nextLine());
		this.tablero = new Tablero(ren, col);
		this.modelo = new Array2D<>(this.tablero.getRejillas().getRenglones(),
				this.tablero.getRejillas().getColumnas());
		for (int i = 0; i < this.tablero.getRejillas().getRenglones(); i++) {
			for (int j = 0; j < this.tablero.getRejillas().getColumnas(); j++) {
				this.tablero.getRejillas().setElemento(i, j, "| * |");
			}
		}

		ren = 0;
		col = 0;
		while (salida.equals("s")) {
			System.out.println("Inserte una coordenada para el renglón de la celula número " + numCel);
			ren = Integer.parseInt(s.nextLine());
			System.out.println("Inserte una coordenada para la columna de la celula número " + numCel);
			col = Integer.parseInt(s.nextLine());
			tablero.getRejillas().setElemento(ren, col, "| O |");
			System.out.println(
					"Si desea agregar más celulas, por favor inserte la letra (s) para seguir añadiendo\no si ya termino de agregar las celulas deseadas, ingrese la letra (n) para finalizar la tarea.");
			salida = s.nextLine();
			numCel++;
		}
	}

	public void empezarJuego() {
		Scanner s = new Scanner(System.in);
		String rejilla;
		int numGen, contGen = 1;
		boolean entrada = true;

		System.out.println("\nAhora indique el número de generaciones que quiera ver");
		numGen = Integer.parseInt(s.nextLine());
		s.close();
		do {
			System.out.println("\n-----------------------------------> Generación " + contGen
					+ " <----------------------------------- \n");
			System.out.println(this.imprimirTablero(this.tablero.getRejillas()));
			for (int renglones = 0; renglones < this.tablero.getRejillas().getRenglones(); renglones++) {
				for (int columnas = 0; columnas < this.tablero.getRejillas().getColumnas(); columnas++) {
					if (renglones == 0 | renglones == (this.tablero.getRejillas().getRenglones() - 1) | columnas == 0
							| columnas == (this.tablero.getRejillas().getColumnas() - 1)) {
						rejilla = this.tablero.moverCeldaExterior(renglones, columnas);
						this.modelo.setElemento(renglones, columnas, rejilla);
					} else {
						rejilla = this.tablero.moverCeldaCentral(renglones, columnas);
						this.modelo.setElemento(renglones, columnas, rejilla);
					}
				}
			}
			contGen++;
			this.replicarArray2D();
			entrada = this.examinarArray2D();
			if (!entrada) {
				System.out.println("\n-----------------------------------> Generación " + contGen
						+ " <----------------------------------- \n");
				System.out.println(this.imprimirTablero(this.tablero.getRejillas()));
			}
			if (contGen == (numGen + 1)) {
				entrada = !entrada;
			}
		} while (entrada);
	}

	private void replicarArray2D() {
		for (int renglones = 0; renglones < this.tablero.getRejillas().getRenglones(); renglones++) {
			for (int columnas = 0; columnas < this.tablero.getRejillas().getColumnas(); columnas++) {
				this.tablero.getRejillas().setElemento(renglones, columnas,
						this.modelo.getElemento(renglones, columnas));
				this.modelo.setElemento(renglones, columnas, null);
			}
		}
	}

	private boolean examinarArray2D() {
		for (int renglones = 0; renglones < this.tablero.getRejillas().getRenglones(); renglones++) {
			for (int columnas = 0; columnas < this.tablero.getRejillas().getColumnas(); columnas++) {
				if (this.tablero.getRejillas().getElemento(renglones, columnas).equals("| O |")) {
					return true;
				}
			}
		}
		return false;
	}

	private String imprimirTablero(Array2D<String> tablero) {
		String array2d = "";
		for (int i = 0; i < tablero.getRenglones(); i++) {
			for (int j = 0; j < tablero.getColumnas(); j++) {
				array2d += tablero.getElemento(i, j) + "  ";
			}
			array2d += "\n";
		}
		return array2d;
	}
}
