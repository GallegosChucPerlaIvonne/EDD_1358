package juegoDeLaVida;

import ADT2D.Array2D;

public class Tablero {

	private int celulasVivas = 0;
	private Array2D<String> rejillas;
	
	public Tablero(int renglones, int columnas) {
		rejillas = new Array2D<>(renglones, columnas);
	}

	public Array2D<String> getRejillas() {
		return rejillas;
	}

	public String moverCeldaCentral(int renglon, int columna) {

		int renglones = renglon, columnas = columna;

		String celda;
		for (int c = 0; c <= 8; c++) {
			switch (c) {
			case 1:
			case 7:
				columnas++;
				this.examinarVecino(renglones, columnas);
				break;
			case 2:
				renglones++;
				this.examinarVecino(renglones, columnas);
				break;
			case 3:
			case 4:
				columnas--;
				this.examinarVecino(renglones, columnas);
				break;
			case 5:
			case 6:
				renglones--;
				this.examinarVecino(renglones, columnas);
				break;
			case 8:
				columnas++;
				this.examinarVecino(renglones, columnas);
				celda = this.aplicarReglas(renglon, columna);
				return celda;
			}
		}
		return "";
	}

	public String moverCeldaExterior(int renglon, int columna) {
		int renglones = renglon, columnas = columna;
		String celda;
		for (int i = 0; i <= 8; i++) {
			switch (i) {
			case 1:
			case 7:
				columnas++;
				if (renglones >= 0 && renglones < this.rejillas.getRenglones() && columnas >= 0
						&& columnas < this.rejillas.getColumnas()) {
					this.examinarVecino(renglones, columnas);
				}
				break;
			case 2:
				renglones++;
				if (renglones >= 0 && renglones < this.rejillas.getRenglones() && columnas >= 0
						&& columnas < this.rejillas.getColumnas()) {
					this.examinarVecino(renglones, columnas);
				}
				break;
			case 3:
			case 4:
				columnas--;
				if (renglones >= 0 && renglones < this.rejillas.getRenglones() && columnas >= 0
						&& columnas < this.rejillas.getColumnas()) {
					this.examinarVecino(renglones, columnas);
				}
				break;
			case 5:
			case 6:
				renglones--;
				if (renglones >= 0 && renglones < this.rejillas.getRenglones() && columnas >= 0
						&& columnas < this.rejillas.getColumnas()) {
					this.examinarVecino(renglones, columnas);
				}
				break;
			case 8:
				columnas++;
				if (renglones >= 0 && renglones < this.rejillas.getRenglones() && columnas >= 0
						&& columnas < this.rejillas.getColumnas()) {
					this.examinarVecino(renglones, columnas);
				}
				celda = this.aplicarReglas(renglon, columna);
				return celda;
			}
		}
		return "";
	}

	private void examinarVecino(int renglones, int columnas) {
		String celda = this.rejillas.getElemento(renglones, columnas);
		if (celda.equals("| O |")) {
			this.celulasVivas++;
		}
	}

	private String aplicarReglas(int renglones, int columnas) {
		String celula = this.rejillas.getElemento(renglones, columnas);
		if (celula.equals("| O |")) {
			if (this.celulasVivas == 2 || this.celulasVivas == 3) {
				this.celulasVivas = 0;
				return "| O |";
			}
		}

		if (celula.equals("| O |")) {
			if (this.celulasVivas == 0 || this.celulasVivas == 1) {
				this.celulasVivas = 0;
				return "| * |";
			}
		}

		if (celula.equals("| O |")) {
			if (this.celulasVivas >= 4) {
				this.celulasVivas = 0;
				return "| * |";
			}
		}

		if (celula.equals("| * |")) {
			if (this.celulasVivas == 3) {
				this.celulasVivas = 0;
				return "| O |";
			}
		}
		this.celulasVivas = 0;
		return "| * |";
	}

	@Override
	public String toString() {
		return this.rejillas.toString();
	}
}
