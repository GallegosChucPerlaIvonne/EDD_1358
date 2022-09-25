package listadoble;

public class Main {
	public static <T> void main(String[] args) {
		ListaDoblementeLigada<Integer> head = new ListaDoblementeLigada<Integer>();
		System.out.println("\nColocación de valores\n");
		head.agregar_al_inicio(54);
		head.agregar_al_final(44);
		head.agregar_al_final(23);
		head.transversal();
		System.out.println("\ntamanio: "+ head.get_tamanio());
		System.out.println("____________________________________________________\n");
		System.out.println("\nAgregar_al_inicio: 777\n");
		head.agregar_al_inicio(777);
		head.transversal();
		System.out.println("\ntamanio: "+ head.get_tamanio());
		System.out.println("____________________________________________________\n");
		System.out.println("\nAgregar_despues_de: posición 2, 101\n");
		head.agregar_despues_de(101, 2);
		head.transversal();
		System.out.println("\ntamanio: "+ head.get_tamanio());
		System.out.println("____________________________________________________\n");
		System.out.println("\nAgregar_al_final: 56\n");
		head.agregar_al_final(56);
		head.transversal();
		System.out.println("\ntamanio: "+ head.get_tamanio());
		System.out.println("____________________________________________________\n");
		System.out.println("\nEliminar_el_primero\n");
		head.Eliminar_el_primero();
		head.transversal();
		System.out.println("\ntamanio: "+ head.get_tamanio());
		System.out.println("____________________________________________________\n");
		System.out.println("\nEliminar posición 2\n");
		head.Eliminar(2);
		head.transversal();
		System.out.println("\ntamanio: "+ head.get_tamanio());
		System.out.println("____________________________________________________\n");
		System.out.println("\nEliminar_al_final\n");
		head.Eliminar_al_final();
		head.transversal();
		System.out.println("\ntamanio: "+ head.get_tamanio());
		System.out.println("____________________________________________________\n");
		System.out.println("\nBuscar; buscar 44\n");
		System.out.println("Posición en la que esta: " + head.buscar(44));
		System.out.println("____________________________________________________\n");
		System.out.println("\nActualizar el 44 a 3102\n");
		head.actualizar(44, 3102);
		head.transversal();
		System.out.println("\ntamanio: "+ head.get_tamanio());
		System.out.println("____________________________________________________\n");
	}
}
