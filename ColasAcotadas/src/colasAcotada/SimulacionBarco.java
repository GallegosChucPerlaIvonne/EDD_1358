package colasAcotada;

import colasAcotada.ColaAcotada;

public class SimulacionBarco {
	public static void main(String[] args) {
		ColaAcotada<String> ColaPrioridad = new ColaAcotada(8);
		System.out.println("\nCola Prioridad\n");
		System.out.println(ColaPrioridad.enqueue(4, "Maestre"));
		System.out.println(ColaPrioridad.enqueue(1, "Ni�as"));
		System.out.println(ColaPrioridad.enqueue(1, "Ni�os"));
		System.out.println(ColaPrioridad.enqueue(4, "Timonel"));
		System.out.println(ColaPrioridad.enqueue(5, "Capit�n"));
		System.out.println(ColaPrioridad.enqueue(2, "3ra Edad"));
		System.out.println(ColaPrioridad.enqueue(4, "Vig�a"));
		System.out.println(ColaPrioridad.enqueue(3, "Hombres"));
		System.out.println(ColaPrioridad.enqueue(4, "Mec�nico"));
		System.out.println(ColaPrioridad.enqueue(3, "Mujeres"));
		
	}
}
