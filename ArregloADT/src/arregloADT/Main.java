package arregloADT;

public class Main {

	public static void main(String[] args) {
		ArregloADT arre[] = { new ArregloADT("Rosita", "Pitbull", 5), new ArregloADT("Rocco", "Aleman", 7),
				new ArregloADT("Roky", "Chichuahua", 5), new ArregloADT("Solovino", "Husky", 5)};
		
		for (int i = 0; i < arre.length; i++) {
			System.out.println(arre[i]);
		}
		 ArregloADT adt = new ArregloADT(null, null, 0); 
		 adt.getNombre();
		 System.out.println(adt); 
		 adt.setNombre("Luisa"); 
		 System.out.println(adt);
		 adt.getRaza();
		 System.out.println();
		 adt.setRaza("Chihuahua");
		 System.out.println();
		 adt.getEdad();
		 System.out.println();
		 adt.setEdad(8);
		 System.out.println(adt); 
		 adt.clear();
		 System.out.println(adt); 
		 adt.toString(); 
		 System.out.println(adt);
		 
	}
}
