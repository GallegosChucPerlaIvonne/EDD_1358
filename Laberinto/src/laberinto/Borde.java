package laberinto;

public class Borde {
	private int tamanioX, tamanioY;

	public Borde(int tX, int tY){
	        this.tamanioX = tX;
	        this.tamanioY = tY;
	    }

	public boolean bordeX(int x) {
		return (x >= 0 && x < tamanioX);
	}

	public boolean bordeY(int y) {
		return (y >= 0 && y < tamanioY);
	}

	public boolean Esquina(int x, int y) {
		return (x == 0 || (x == tamanioX - 1)) && (y == 0 || y == tamanioY - 1);

	}

	public boolean dentroborde(int x, int y) {
		return ((x > 0 && x < tamanioX - 1) && (y > 0 && y < tamanioY - 1));

	}

	public boolean enBorde(int x, int y) {
		return !((x > 0 && x < tamanioX - 1) && (y > 0 && y < tamanioY - 1));
	}

	public int getContadorX(int x, int y) {
		if (x == 0) {
			return x;
		} else {
			return x - 1;
		}
	}

	public int getLimiteX(int x, int y) {
		if (x == tamanioX - 1) {
			return x + 1;
		} else {
			return x + 2;
		}
	}

	public int getContadorY(int x, int y) {
		if (y == 0) {
			return y;
		} else {
			return y - 1;
		}
	}

	public int getLimiteY(int x, int y) {
		if (y == tamanioY - 1) {
			return y + 1;
		} else {
			return y + 2;

		}
	}
}
