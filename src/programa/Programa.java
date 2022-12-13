package programa;
import arrayListADT.*;
import linkedListADT.*;
import stackADT.*;
import java.util.Scanner;

public class Programa {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		int opcion = 0;

		do {
			System.out.println("\n***BIENVENIDO A LA PRUEBA DE CLASES*** \nHecho por: Gallegos Chuc Perla Ivonne");
			System.out.println("\n1) Probar la clase ArrayList");
			System.out.println("2) Probar la clase LinkedList");
			System.out.println("3) Probar la clase Stack");
			System.out.println("4) Salir del programa");
			System.out.println("\nSeleccione alguna de las anteriores opciones:");

			opcion = scanner.nextInt();

			switch (opcion) {

			case 1:
				System.out.println("\nArrayList\n");
				ArrayList peces = new ArrayList();
				System.out.println("Peces que puedes tener en un acuario de 20 litros");
				peces.add("Beta");
				peces.add("Guppy");
				peces.add("Dorado");
				peces.add("Luna");
				peces.add("Angel");
				/*for (int i = 1; i <= 100; i++) {
					peces.add("acuario" + i);
				}*/
				for (int i = 0; i < peces.getSize(); i++) {
					System.out.println(peces.get(i));
				}
				System.out.println(peces.getSize());
				peces.remove(3);
				System.out.println(peces.get(3));
				System.out.println(peces.getSize());
				break;
			case 2:
				System.out.println("\nLinkedList");
				LinkedList lista =new LinkedList();
				lista.addFirst(12);
		        System.out.print("Añadiendo como primero 12: ");
		        lista.print();
		 
		        lista.addFirst(9);
		        System.out.print("Añadiendo como primero 9: ");
		        lista.print();
		 
		        lista.addLast(17);
		        System.out.print("Añadiendo como ultimo 17: ");
		        lista.print();
		        
		        lista.addLast(23);
		        System.out.print("Añadiendo como ultimo 23: ");
		        lista.print();
		 
		        lista.addLast(21);
		        System.out.print("Añadiendo como ultimo 21: ");
		        lista.print();
		 
		        lista.addFirst(34);
		        System.out.print("Añadiendo como primero 34: ");
		        lista.print();
		 
		        lista.add(2, 2);
		        System.out.print("Añadiendo en la posición 2: ");
		        lista.print();
		 
		        lista.deleteFirst();
		        System.out.print("Despues de eliminar el primer Nodo 34: ");
		        lista.print();
		 
		        lista.deleteLast();
		        System.out.print("Despues de eliminar el ultimo Nodo 21: ");
		        lista.print();
		 
		        lista.delete(3);
		        System.out.print("Despues Eliminar el nodo en la posición 3: ");
		        lista.print();
		        
		        System.out.println("\n¿Existe el 23 en la lista actual?  " + lista.search(23));
				break;
			case 3:
				System.out.println("\nStack");
				Stack objeto = new Stack(10);

				objeto.push(21);
				objeto.push(76);
				objeto.push(54);
				objeto.push(89);
				objeto.push(2);
				objeto.push(12);
				objeto.push(52);
				objeto.push(31);
				objeto.push(56);
				try {
					objeto.push(44);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				try {
					objeto.push(66);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				System.out.println("Elemento al tope es " + objeto.peek());
				System.out.println("Pop -> " + objeto.pop());
				System.out.println("Elemento arriba del tope " + objeto.peek());
				objeto.print();
				break;
			case 4:
				break;
			default:
				System.out.println("Escoja una opción dentro del parámetro por favor");
			}
		} while (opcion != 4);
		System.out.println("El programa ha finalizado exitosamente");
	}
}
