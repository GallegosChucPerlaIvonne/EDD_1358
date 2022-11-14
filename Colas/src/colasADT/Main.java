package colasADT;

public class Main {

	public static void main(String[] args) {
		ADT_Colas colas = new ADT_Colas<>();
		System.out.println("\nColaADT");
		System.out.println(colas.is_empty() + "\n");
		colas.enqueue(1);
		colas.enqueue(2);
		colas.enqueue(3);
		colas.enqueue(4);
		System.out.println(colas.to_string() + "\n");
		System.out.println(colas.length() + "\n");
		colas.dequeue();
		System.out.println(colas.to_string() + "\n");
		colas.enqueue(2);
		System.out.println(colas.to_string() + "\n");
		System.out.println(colas.is_empty() + "\n");
		System.out.println(colas.to_string() + "\n");
	}
}
