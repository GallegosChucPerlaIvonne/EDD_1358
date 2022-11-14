package colasAcotada;

import colasAcotada.ColaAcotada;

public class SimulacionBarco {
	public static void main(String[] args) {
		ColaAcotada<String> ColaPrioridad = new ColaAcotada(8);
		System.out.println("\nCola Prioridad\n");
		System.out.println(ColaPrioridad.enqueue(4, "Maestre"));
		System.out.println(ColaPrioridad.enqueue(1, "Niñas"));
		System.out.println(ColaPrioridad.enqueue(1, "Niños"));
		System.out.println(ColaPrioridad.enqueue(4, "Timonel"));
		System.out.println(ColaPrioridad.enqueue(5, "Capitán"));
		System.out.println(ColaPrioridad.enqueue(2, "3ra Edad"));
		System.out.println(ColaPrioridad.enqueue(4, "Vigía"));
		System.out.println(ColaPrioridad.enqueue(3, "Hombres"));
		System.out.println(ColaPrioridad.enqueue(4, "Mecánico"));
		System.out.println(ColaPrioridad.enqueue(3, "Mujeres"));
		
	}
}
