package tablaHash;

public class Main {
	public static void main(String[] args) {
		TablaHash lista = new TablaHash(10);
		lista.Add(7, "Closet");
		lista.Add(6, "Escritorio");
		lista.Add(11, "Mesa");
		lista.Add(3, "Caja");
		lista.Add(2, "Maceta");
		lista.Add(4, "Cajon");
		System.out.println(lista.valueOf(6));
		lista.Remove(6);
		System.out.println(lista.valueOf(6));
		lista.Remove(11);
		System.out.println(lista.valueOf(11));
	}

}
