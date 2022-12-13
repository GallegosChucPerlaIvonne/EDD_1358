package stackADT;

public class MainStack {

	public static void main(String[] args) {
		Stack objeto = new Stack(7);

		objeto.push(32);
		objeto.push(13);
		objeto.push(22);
		objeto.push(41);
		objeto.push(9);
		objeto.push(17);
		objeto.push(43);
		objeto.print();
		try {
			objeto.push(44);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Elemento al tope es " + objeto.peek());
		System.out.println("Pop -> " + objeto.pop());
		System.out.println("Elemento arriba del tope " + objeto.peek());
		objeto.print();
	}
}
