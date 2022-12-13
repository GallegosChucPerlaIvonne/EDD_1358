package linkedListADT;

public class MainLinkedList {
	public static void main(String[] args) {
		LinkedList lista =new LinkedList();
		lista.addFirst(20);
        System.out.print("Añadiendo como primero: ");
        lista.print();
 
        lista.addFirst(10);
        System.out.print("Añadiendo como primero: ");
        lista.print();
 
        lista.addLast(30);
        System.out.print("Añadiendo como ultimo: ");
        lista.print();
 
        lista.addLast(40);
        System.out.print("Añadiendo como ultimo: ");
        lista.print();
 
        lista.addFirst(5);
        System.out.print("Añadiendo como primero: ");
        lista.print();
 
        lista.add(4, 25);
        System.out.print("Añadiendo en la posición 4: ");
        lista.print();
 
        lista.deleteFirst();
        System.out.print("Despues de eliminar el primer Nodo: ");
        lista.print();
 
        lista.deleteLast();
        System.out.print("Despues de eliminar el ultimo Nodo: ");
        lista.print();
 
        lista.delete(3);
        System.out.print("Despues de Eliminar el nodo en la posición 3: ");
        lista.print();
        
        System.out.println(lista.search(10));
	}
}
