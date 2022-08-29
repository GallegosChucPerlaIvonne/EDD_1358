package arregloADT;

public class ArregloADT {

	private String nombre;
	private String raza;
	private int edad;

	public ArregloADT(String nombre, String raza, int edad) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getLength() {
		return 0;
	}

	public void clear() {
		ArregloADT arre = null;
		arre.clear();
	}

	@Override
	public String toString() {
		return "ArregloADT [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + "]";
	}
}
