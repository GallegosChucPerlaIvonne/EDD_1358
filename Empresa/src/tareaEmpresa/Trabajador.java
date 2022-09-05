/*
Alumna: Gallegos Chuc Perla Ivonne
Tarea 3: Empresa
*/
package tareaEmpresa;

public class Trabajador {

	public static void main(String[] args) {
		Trabajador Nuevo = new Trabajador(23, "Rafael Bernardo", "Villalobos", "Barroso", 0, 9850, 2013);
		System.out.println(Nuevo.toString());
		System.out.println("\n---->Sueldo Calculado= " + Nuevo.CalcularSueldo());
	}

	private int numeroTrabajador;
	private String nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private int horasExtras;
	private int sueldoBase;
	private int anioIngreso;
	private int antiguedad;
	private double total;
	double hep = 275.5;

	public Trabajador(int numeroTrabajador, String nombres, String apellidoPaterno, String apellidoMaterno,
			int horasExtras, int sueldoBase, int anioIngreso) {
		super();
		this.numeroTrabajador = numeroTrabajador;
		this.nombres = nombres;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.horasExtras = horasExtras;
		this.sueldoBase = sueldoBase;
		this.anioIngreso = anioIngreso;
	}

	public int getNumeroTrabajador() {
		return numeroTrabajador;
	}

	public void setNumeroTrabajador(int numeroTrabajador) {
		this.numeroTrabajador = numeroTrabajador;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public int getAnioIngreso() {
		return anioIngreso;
	}

	public void setAnioIngreso(int anioIngreso) {
		this.anioIngreso = anioIngreso;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString() {
		return "" + numeroTrabajador + "\n" + nombres + "\n"
				+ apellidoPaterno + "\n" + apellidoMaterno + "\n" + horasExtras
				+ "\n" + sueldoBase + "\n" + anioIngreso + "";
	}

	public double CalcularSueldo() {
		int antiguedad = 2022 - this.anioIngreso;
		total = this.sueldoBase + (this.sueldoBase * (antiguedad * 0.03)) + this.horasExtras * hep;
		return total;
	}
}
